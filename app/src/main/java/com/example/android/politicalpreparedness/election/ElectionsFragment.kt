package com.example.android.politicalpreparedness.election

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.base.BaseFragment
import com.example.android.politicalpreparedness.base.BaseViewModel
import com.example.android.politicalpreparedness.base.NavigationCommand
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.databinding.FragmentElectionBinding
import com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter
import com.example.android.politicalpreparedness.election.adapter.ElectionListener
import com.example.android.politicalpreparedness.repository.ElectionRepository
import com.example.android.politicalpreparedness.utils.setDisplayHomeAsUpEnabled
import com.example.android.politicalpreparedness.utils.setTitle

class ElectionsFragment : BaseFragment() {

    //Declare ViewModel
    override val _viewModel: ElectionsViewModel by lazy {
        val activity = requireNotNull(this.activity) {
            "You can only access the viewModel after onViewCreated()"
        }
        val database = ElectionDatabase.getInstance(requireContext())
        val repository = ElectionRepository(database)
        ViewModelProvider(this, ElectionsViewModelFactory(repository, activity.application)).get(
            ElectionsViewModel::class.java
        )
    }

    private lateinit var upcomingElectionsListAdapter: ElectionListAdapter
    private lateinit var savedElectionsListAdapter: ElectionListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Add ViewModel values and create ViewModel
        //Add binding values
        val binding = FragmentElectionBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.electionViewModel = _viewModel

        setHasOptionsMenu(false)
        setDisplayHomeAsUpEnabled(true)
        setTitle(getString(R.string.app_name))
        //Link elections to voter info
        //initiate recycler adapters
        //Populate recycler adapters
        val adapter = ElectionListAdapter(ElectionListener { election ->
            _viewModel.navigationCommand.postValue(
                NavigationCommand.To(
                    ElectionsFragmentDirections.actionElectionsFragmentToVoterInfoFragment(election)
                )
            )
        })

        val adapter2 = ElectionListAdapter(ElectionListener { election ->
            _viewModel.navigationCommand.postValue(
                NavigationCommand.To(
                    ElectionsFragmentDirections.actionElectionsFragmentToVoterInfoFragment(election)
                )
            )
        })

        binding.upComingRecyclerView.adapter = adapter
        binding.saveElectionRecyclerView.adapter = adapter2

        _viewModel.upcomingElection.observe(viewLifecycleOwner) {
            it.let {
                adapter.submitList(it)
            }
        }

        _viewModel.savedElections.observe(viewLifecycleOwner) {
            it.let {
                adapter2.submitList(it)
            }
        }

        return binding.root
    }



}