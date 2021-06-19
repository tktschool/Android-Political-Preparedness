package com.example.android.politicalpreparedness.representative

import android.Manifest
import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.content.Context
import android.content.Intent
import android.content.IntentSender
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.*
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.android.politicalpreparedness.BuildConfig
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.base.BaseFragment
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.databinding.FragmentRepresentativeBinding
import com.example.android.politicalpreparedness.election.ElectionsViewModel
import com.example.android.politicalpreparedness.election.ElectionsViewModelFactory
import com.example.android.politicalpreparedness.network.models.Address
import com.example.android.politicalpreparedness.repository.ElectionRepository
import com.example.android.politicalpreparedness.representative.adapter.RepresentativeListAdapter
import com.example.android.politicalpreparedness.utils.setDisplayHomeAsUpEnabled
import com.example.android.politicalpreparedness.utils.setTitle
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest
import com.google.android.material.snackbar.Snackbar
import kotlinx.io.IOException
import java.util.Locale

class DetailFragment : BaseFragment() {

    private lateinit var binding: FragmentRepresentativeBinding
    private val runningQOrLater =
        android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    override val _viewModel: RepresentativeViewModel by lazy {
        val activity = requireNotNull(this.activity) {
            "You can only access the viewModel after onViewCreated()"
        }
        val database = ElectionDatabase.getInstance(requireContext())
        val repository = ElectionRepository(database)
        ViewModelProvider(
            this,
            RepresentativeViewModelFactory(repository, activity.application)
        ).get(
            RepresentativeViewModel::class.java
        )
    }

    companion object {
        const val REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE = 34
        const val REQUEST_BACKGROUND_ONLY_PERMISSIONS_REQUEST_CODE = 35
        const val REQUEST_TURN_DEVICE_LOCATION_ON = 29
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Establish bindings
        binding = FragmentRepresentativeBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = _viewModel
        setHasOptionsMenu(false)
        setDisplayHomeAsUpEnabled(true)
        setTitle(getString(R.string.app_name))

        //Populate Representative adapter
        val representativeListAdapter = RepresentativeListAdapter()
        binding.representativesRecyclerview.adapter = representativeListAdapter

        _viewModel.representatives.observe(viewLifecycleOwner, Observer {
            it?.let {
                representativeListAdapter.submitList(it)
            }
        })

        binding.state.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                _viewModel.address.value?.state = binding.state.selectedItem as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                _viewModel.address.value?.state = binding.state.selectedItem as String
            }
        }

        //Search button
        binding.buttonSearch.setOnClickListener {
            hideKeyboard()
            _viewModel.address.value?.let { address ->
                _viewModel.getRepresentativesByAddress(
                    address
                )
            }
        }

        //Establish button listeners for field and location search
        binding.buttonLocation.setOnClickListener {
            if (checkLocationPermissions()) { //Check location permissions
                checkDeviceLocationSettings() //Check device location and getLocation
                hideKeyboard()
            }
        }

        //LocationServices
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())

        return binding.root
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_TURN_DEVICE_LOCATION_ON) {
            checkDeviceLocationSettings(false)
        }
    }

    @SuppressLint("MissingPermission")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (grantResults.isEmpty() ||
            grantResults[0] == PackageManager.PERMISSION_DENIED ||
            (requestCode == REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE &&
                    grantResults[0] == PackageManager.PERMISSION_DENIED)
        ) {
            Snackbar.make(
                requireActivity().findViewById(android.R.id.content),
                getString(R.string.permission_denied_explanation),
                Snackbar.LENGTH_INDEFINITE
            ).setAction(getString(R.string.settings)) {
                // Displays App settings screen.
                startActivity(Intent().apply {
                    action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                    data = Uri.fromParts("package", BuildConfig.APPLICATION_ID, null)
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK
                })
            }.show()
        } else if (grantResults.isEmpty() ||
            grantResults[0] == PackageManager.PERMISSION_DENIED ||
            (requestCode == REQUEST_BACKGROUND_ONLY_PERMISSIONS_REQUEST_CODE &&
                    grantResults[0] == PackageManager.PERMISSION_DENIED)
        ) {
            Snackbar.make(
                requireActivity().findViewById(android.R.id.content),
                getString(R.string.permission_denied_explanation), Snackbar.LENGTH_INDEFINITE
            ).setAction(getString(R.string.settings)) {
                // Displays App settings screen.
                startActivity(Intent().apply {
                    action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                    data = Uri.fromParts("package", BuildConfig.APPLICATION_ID, null)
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK
                })
            }.show()
        } else {
            checkLocationPermissions()
        }
    }

    private fun checkLocationPermissions(): Boolean {
        return if (isPermissionGranted()) {
            true
        } else {
            //Request Location permissions
            requestForegroundLocationPermission()
            requestBackgroundLocationPermission()
            false
        }
    }

    @TargetApi(29)
    private fun isPermissionGranted(): Boolean {
        //Check if permission is already granted and return (true = granted, false = denied/other)
        return foregroundLocationPermissionGranted() && backgroundLocationPermissionGranted()
    }

    private fun foregroundLocationPermissionGranted(): Boolean {
        return (PackageManager.PERMISSION_GRANTED == ActivityCompat.checkSelfPermission(
            requireContext(),
            Manifest.permission.ACCESS_FINE_LOCATION
        ))
    }

    @TargetApi(29)
    private fun backgroundLocationPermissionGranted(): Boolean {
        return if (runningQOrLater) {
            PackageManager.PERMISSION_GRANTED == ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_BACKGROUND_LOCATION
            )
        } else {
            true
        }
    }

    private fun checkDeviceLocationSettings(resolve: Boolean = true) {
        val locationRequest = LocationRequest.create().apply {
            priority = LocationRequest.PRIORITY_LOW_POWER
        }
        val builder = LocationSettingsRequest.Builder().addLocationRequest(locationRequest)

        val settingsClient = LocationServices.getSettingsClient(requireActivity())
        val locationSettingsResponseTask = settingsClient.checkLocationSettings(builder.build())

        locationSettingsResponseTask.addOnFailureListener { exception ->
            if (exception is ResolvableApiException && resolve) {

                try {
                    startIntentSenderForResult(
                        exception.resolution.intentSender,
                        REQUEST_TURN_DEVICE_LOCATION_ON,
                        null,
                        0,
                        0,
                        0,
                        null
                    )
                } catch (sendEx: IntentSender.SendIntentException) {
                   _viewModel.showErrorMessage.value = "Error getting location settings resolution: " + sendEx.message
                }
            } else {
                Snackbar.make(
                    requireActivity().findViewById(android.R.id.content),
                    getString(R.string.location_required_error),
                    Snackbar.LENGTH_INDEFINITE
                ).setAction(android.R.string.ok) {
                    checkDeviceLocationSettings()
                }.show()
            }
        }

        locationSettingsResponseTask.addOnCompleteListener {
            if (it.isSuccessful) {
                getLocation()
            }
        }
    }


    private fun requestForegroundLocationPermission() {
        if (foregroundLocationPermissionGranted()) {
            return
        }

        val permissionsArray = arrayOf(Manifest.permission.ACCESS_FINE_LOCATION)

        val resultCode = REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE

        requestPermissions(
            permissionsArray,
            resultCode
        )
    }

    @TargetApi(29)
    private fun requestBackgroundLocationPermission() {
        if (backgroundLocationPermissionGranted()) {
            return
        }

        val permissionsArray = arrayOf(Manifest.permission.ACCESS_BACKGROUND_LOCATION)

        val resultCode = REQUEST_BACKGROUND_ONLY_PERMISSIONS_REQUEST_CODE

        if (foregroundLocationPermissionGranted()) {
            if (runningQOrLater) {
                requestPermissions(
                    permissionsArray,
                    resultCode
                )
            }
        }
    }


    @SuppressLint("MissingPermission")
    private fun getLocation() {
        //Get location from LocationServices
        //The geoCodeLocation method is a helper function to change the lat/long location to a human readable street address
        fusedLocationClient.lastLocation.addOnSuccessListener { location ->
            location?.let {
                try {
                    val address = geoCodeLocation(location)
                    _viewModel.setAddress(address)
                    _viewModel.getRepresentativesByAddress(address)
                } catch (ex: IOException) {
                    _viewModel.showErrorMessage.value =
                        getString(R.string.internet_connection_error)
                } catch (ex: Exception) {
                    _viewModel.showErrorMessage.value = getString(R.string.can_not_find_location)
                }
            }
        }
    }

    private fun geoCodeLocation(location: Location): Address {
        val geocoder = Geocoder(context, Locale.getDefault())
        return geocoder.getFromLocation(location.latitude, location.longitude, 1)
            .map { address ->
                Address(
                    address.thoroughfare,
                    address.subThoroughfare,
                    address.locality,
                    address.adminArea,
                    address.postalCode
                )
            }
            .first()
    }

    private fun hideKeyboard() {
        val imm = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(requireView().windowToken, 0)
    }

}