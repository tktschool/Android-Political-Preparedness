package com.example.android.politicalpreparedness.election

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.politicalpreparedness.network.models.Election
import com.example.android.politicalpreparedness.repository.ElectionRepository

//TCreate Factory to generate VoterInfoViewModel with provided election datasource
class VoterInfoViewModelFactory(
    private val repository: ElectionRepository,
    private val followString: String,
    private val unfollowString: String,
    private val election: Election,
    private val app: Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(VoterInfoViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return VoterInfoViewModel(repository, followString, unfollowString, election, app) as T
        }
        throw IllegalArgumentException("Unable to construct viewmodel")
    }
}