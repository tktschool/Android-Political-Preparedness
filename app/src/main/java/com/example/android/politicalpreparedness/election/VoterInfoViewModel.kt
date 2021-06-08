package com.example.android.politicalpreparedness.election

import android.app.Application
import androidx.lifecycle.*
import com.example.android.politicalpreparedness.base.BaseViewModel
import com.example.android.politicalpreparedness.database.ElectionDao
import com.example.android.politicalpreparedness.network.models.Election
import com.example.android.politicalpreparedness.repository.ElectionRepository
import com.example.android.politicalpreparedness.utils.SingleLiveEvent
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

    private val _voterInfoFetched = MutableLiveData<Boolean>(false)
    val voterInfoFetched: LiveData<Boolean>
        get() = _voterInfoFetched

    private val _errorOnFetchingNetwork = MutableLiveData<Boolean>(false)
    val errorOnFetchingNetwork: LiveData<Boolean>
        get() = _errorOnFetchingNetwork

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

    //TODO: Add var and methods to save and remove elections to local database
    fun onFollowButtonClicked() {
        viewModelScope.launch {
            if (repository.hasElection(election)) {
                repository.unfollowElection(election)
                _followButtonState.value = unfollowString
            } else {
                repository.followElection(election)
                _followButtonState.value = followString
            }
        }
    }

    private suspend fun initFollowButton() {
        viewModelScope.launch {
            if (repository.hasElection(election)) {
                _followButtonState.value = followString
            } else {
                _followButtonState.value = unfollowString
            }
        }
    }

    //TODO: cont'd -- Populate initial state of save button to reflect proper action based on election saved status

    /**
     * Hint: The saved state can be accomplished in multiple ways. It is directly related to how elections are saved/removed from the database.
     */

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
        voterInfo.state?.first()?.electionAdministrationBody?.correspondenceAddress
    }

    val correspondenceAddress = Transformations.map(voterInfo) { voterInfo ->
        voterInfo.state?.first()?.electionAdministrationBody?.correspondenceAddress?.toFormattedString()
    }

    init {
        viewModelScope.launch {
            getVoterInfo()
            initFollowButton()
        }
    }

    private suspend fun getVoterInfo() {
        try {
            _voterInfoFetched.value = false
            repository.refreshVoterInfo(election.division.state, election.id)
            _errorOnFetchingNetwork.value = false
            _voterInfoFetched.value = true
        } catch (networkError: IOException) {
            _errorOnFetchingNetwork.value = true
        }
    }

}