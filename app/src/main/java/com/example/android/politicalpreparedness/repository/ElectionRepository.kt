package com.example.android.politicalpreparedness.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.network.CivicsApi
import com.example.android.politicalpreparedness.network.models.Election
import com.example.android.politicalpreparedness.network.models.VoterInfoResponse
import com.example.android.politicalpreparedness.representative.model.Representative
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

class ElectionRepository(private val database: ElectionDatabase) {

    private val _upcomingElections = MutableLiveData<List<Election>>()
    val upcomingElection: LiveData<List<Election>>
        get() = _upcomingElections

    val savedElections: LiveData<List<Election>>
        get() = database.electionDao.getAllElections()

    private val _voterInfo = MutableLiveData<VoterInfoResponse>()
    val voterInfo: LiveData<VoterInfoResponse>
        get() = _voterInfo

    private val _representatives = MutableLiveData<List<Representative>>()
    val representatives: LiveData<List<Representative>>
        get() = _representatives

    suspend fun followElection(election: Election) {
        withContext(Dispatchers.IO) {
            database.electionDao.insertElection(election)
        }
    }

    suspend fun unfollowElection(election: Election) {
        withContext(Dispatchers.IO) {
            database.electionDao.deleteElection(election.id)
        }
    }

    suspend fun hasElection(election: Election): Boolean {
        return withContext(Dispatchers.IO) {
            election == database.electionDao.getElectionById(election.id)
        }
    }

    suspend fun refreshUpcomingElections() {
        withContext(Dispatchers.IO) {
            try {
                val result = CivicsApi.retrofitService.getElections()
                _upcomingElections.postValue(result.elections)
            } catch (e: Exception) {
                e.message?.let { Log.e("ElectionRepository refreshUpcomingElections", e.message!!) }
            }
        }
    }

    suspend fun refreshRepresentatives(address: String) {
        withContext(Dispatchers.IO) {
            try {
                val (offices, officials) = CivicsApi.retrofitService.getRepresentatives(address)
                _representatives.postValue(offices.flatMap { office -> office.getRepresentatives(officials) })
            } catch (e: Exception) {
                e.message?.let { Log.e("ElectionRepository refreshRepresentatives", e.message!!) }
            }
        }
    }

    suspend fun refreshVoterInfo(address: String, electionId: Int) {
        withContext(Dispatchers.IO) {
            try {
                val result = CivicsApi.retrofitService.getVoterInfo(address, electionId)
                _voterInfo.postValue(result)
            } catch (e: Exception) {
                e.message?.let { Log.e("ElectionRepository refreshVoterInfo", e.message!!) }
            }
        }
    }

}