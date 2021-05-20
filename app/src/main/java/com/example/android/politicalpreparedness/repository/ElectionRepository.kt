package com.example.android.politicalpreparedness.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.network.CivicsApi
import com.example.android.politicalpreparedness.network.models.Election
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

class ElectionRepository(private val database: ElectionDatabase) {

    private val _upcomingElections = MutableLiveData<List<Election>>()
    val upcomingElection: LiveData<List<Election>>
        get() = _upcomingElections

    suspend fun refreshUpcomingElections() {
        withContext(Dispatchers.IO) {
            try {
                val result = CivicsApi.retrofitService.getElections()
                _upcomingElections.postValue(result.elections)
            } catch (e: Exception) {
                e.message?.let { Log.e("ElectionRepository", e.message!!) }
            }
        }
    }

}