package com.example.android.politicalpreparedness.election

import android.app.Application
import androidx.lifecycle.*
import com.example.android.politicalpreparedness.base.BaseViewModel
import com.example.android.politicalpreparedness.repository.ElectionRepository
import com.example.android.politicalpreparedness.utils.isNetworkAvailable
import kotlinx.coroutines.launch

//Construct ViewModel and provide election datasource
class ElectionsViewModel(private val repository: ElectionRepository, application: Application) :
    BaseViewModel(application) {

    //Create live data val for upcoming elections
    val upcomingElection = repository.upcomingElection
    val savedElections = repository.savedElections

    private val _isNetworkAvailable = MutableLiveData<Boolean>(false)
    val isNetworkAvailable: LiveData<Boolean>
        get() = _isNetworkAvailable

    init {
        viewModelScope.launch {
            if (isNetworkAvailable(application)) {
                _isNetworkAvailable.value = true
                repository.refreshUpcomingElections()
            } else {
                _isNetworkAvailable.value = false
            }
        }
    }

}

