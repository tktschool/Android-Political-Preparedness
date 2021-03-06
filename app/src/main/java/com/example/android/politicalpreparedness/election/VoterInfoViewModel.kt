package com.example.android.politicalpreparedness.election

import android.app.Application
import androidx.lifecycle.*
import com.example.android.politicalpreparedness.base.BaseViewModel
import com.example.android.politicalpreparedness.database.ElectionDao
import com.example.android.politicalpreparedness.network.models.Election
import com.example.android.politicalpreparedness.repository.ElectionRepository
import com.example.android.politicalpreparedness.utils.SingleLiveEvent
import com.example.android.politicalpreparedness.utils.isNetworkAvailable
import kotlinx.coroutines.launch
import java.io.IOException

class VoterInfoViewModel(
    private val repository: ElectionRepository,
    private val followString: String,
    private val unfollowString: String,
    private val election: Election,
    app: Application
) : BaseViewModel(app) {

    //Add live data to hold voter info
    //Add var and methods to populate voter info
    val voterInfo = repository.voterInfo

    private val _isNetworkAvailable = MutableLiveData<Boolean>(false)
    val isNetworkAvailable: LiveData<Boolean>
        get() = _isNetworkAvailable

    private val _showVotingLocations = MutableLiveData<Boolean>(false)
    val showVotingLocations: LiveData<Boolean>
        get() = _showVotingLocations

    private val _showBallotInformation = MutableLiveData<Boolean>(false)
    val showBallotInformation: LiveData<Boolean>
        get() = _showBallotInformation

    private val _followButtonState = MutableLiveData<String>()
    val followButtonState: LiveData<String>
        get() = _followButtonState

    //Add var and methods to support loading URLs
    fun onVotingLocationsClicked() {
        _showVotingLocations.value = true
    }

    fun onBallotInformationClicked() {
        _showBallotInformation.value = true
    }

    //Add var and methods to save and remove elections to local database
    fun onFollowButtonClicked() {
        viewModelScope.launch {
            if (repository.hasElection(election)) {
                repository.unfollowElection(election)
                _followButtonState.value = followString
            } else {
                repository.followElection(election)
                _followButtonState.value = unfollowString
            }
        }
    }

    private suspend fun initFollowButton() {
        viewModelScope.launch {
            if (repository.hasElection(election)) {
                _followButtonState.value = unfollowString
            } else {
                _followButtonState.value = followString
            }
        }
    }

    val hasElectionInfo = Transformations.map(voterInfo) { voterInfo ->
        voterInfo.state?.first()?.electionAdministrationBody?.electionInfoUrl
    }

    val hasVotingLocationsInfo = Transformations.map(voterInfo) { voterInfo ->
        voterInfo.state?.first()?.electionAdministrationBody?.votingLocationFinderUrl
    }

    val hasBallotInfo = Transformations.map(voterInfo) { voterInfo ->
        voterInfo.state?.first()?.electionAdministrationBody?.ballotInfoUrl
    }

    val hasCorrespondenceInformation = Transformations.map(voterInfo) { voterInfo ->
        voterInfo.state?.first()?.electionAdministrationBody?.correspondenceAddress != null
    }

    val correspondenceAddress = Transformations.map(voterInfo) { voterInfo ->
        voterInfo.state?.first()?.electionAdministrationBody?.correspondenceAddress?.toFormattedString()
    }

    init {
        viewModelScope.launch {
            if (isNetworkAvailable(app)) {
                _isNetworkAvailable.value = true
                getVoterInfo()
            } else {
                _isNetworkAvailable.value = false
            }
            initFollowButton()
        }
    }

    private suspend fun getVoterInfo() {
        try {
            repository.refreshVoterInfo(election.division.state, election.id)
        } catch (networkError: IOException) {
            showErrorMessage.value = networkError.message
        }
    }

}