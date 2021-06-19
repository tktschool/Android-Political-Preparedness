package com.example.android.politicalpreparedness.election

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.politicalpreparedness.base.BaseViewModel
import com.example.android.politicalpreparedness.repository.ElectionRepository
import kotlinx.coroutines.launch

//Construct ViewModel and provide election datasource
class ElectionsViewModel(private val repository: ElectionRepository, application: Application) : BaseViewModel(application) {

    //Create live data val for upcoming elections
    val upcomingElection = repository.upcomingElection
    val savedElections = repository.savedElections

    init {
        viewModelScope.launch {
            repository.refreshUpcomingElections()
            //repository.getSavedElection()
        }
    }

}