package com.example.android.politicalpreparedness.election

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.base.BaseFragment
import com.example.android.politicalpreparedness.base.BaseViewModel
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.databinding.FragmentVoterInfoBinding
import com.example.android.politicalpreparedness.repository.ElectionRepository
import com.example.android.politicalpreparedness.utils.setDisplayHomeAsUpEnabled
import com.example.android.politicalpreparedness.utils.setTitle

class VoterInfoFragment : BaseFragment() {
    override val _viewModel: VoterInfoViewModel  by lazy {
        val activity = requireNotNull(this.activity) {
            "You can only access the viewModel after onViewCreated()"
        }
        val database = ElectionDatabase.getInstance(requireContext())
        val repository = ElectionRepository(database)
        val election = VoterInfoFragmentArgs.fromBundle(requireArguments()).argElection
        ViewModelProvider(this, VoterInfoViewModelFactory(repository, getString(R.string.follow_election), getString(R.string.unfollow_election), election , activity.application)).get(
            VoterInfoViewModel::class.java
        )
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        //TODO: Add ViewModel values and create ViewModel

        //TODO: Add binding values
        val binding = FragmentVoterInfoBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        setHasOptionsMenu(false)
        setDisplayHomeAsUpEnabled(true)
        setTitle(getString(R.string.app_name))
        val election = VoterInfoFragmentArgs.fromBundle(requireArguments()).argElection
        binding.election = election
        binding.voterInfoViewModel = _viewModel

        //TODO: Handle loading of URLs
        _viewModel.showVotingLocations.observe(viewLifecycleOwner) {
            if (it) {
                val uri = Uri.parse(_viewModel.hasVotingLocationsInfo.value)
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        }

        //TODO: Handle save button UI state
        //TODO: cont'd Handle save button clicks
        return binding.root
    }

    //TODO: Create method to load URL intents

}