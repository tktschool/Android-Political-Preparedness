package com.example.android.politicalpreparedness.representative

import android.Manifest
import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.content.Context
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.view.*
import android.view.inputmethod.InputMethodManager
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.android.politicalpreparedness.base.BaseFragment
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.databinding.FragmentRepresentativeBinding
import com.example.android.politicalpreparedness.election.ElectionsViewModel
import com.example.android.politicalpreparedness.election.ElectionsViewModelFactory
import com.example.android.politicalpreparedness.network.models.Address
import com.example.android.politicalpreparedness.repository.ElectionRepository
import com.example.android.politicalpreparedness.representative.adapter.RepresentativeListAdapter
import com.google.android.gms.location.FusedLocationProviderClient
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

        //TODO: Establish bindings
        binding = FragmentRepresentativeBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = _viewModel

        //TODO: Populate Representative adapter
        val representativeListAdapter = RepresentativeListAdapter()

        _viewModel.representatives.observe(viewLifecycleOwner, { representatives ->
            representatives?.let {

            }
        })
        //TODO: Establish button listeners for field and location search



        binding.buttonLocation.setOnClickListener {
            if (checkLocationPermissions()) {
                getLocation()
            }
        }

        return binding.root
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        //TODO: Handle location permission result to get location on permission granted
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
                val address = geoCodeLocation(location)
                //TODO LINK TO MODEL
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
        imm.hideSoftInputFromWindow(view!!.windowToken, 0)
    }

}

const val REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE = 34
const val REQUEST_BACKGROUND_ONLY_PERMISSIONS_REQUEST_CODE = 35