package com.example.android.politicalpreparedness.representative

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.android.politicalpreparedness.base.BaseViewModel
import com.example.android.politicalpreparedness.election.ElectionsViewModel
import com.example.android.politicalpreparedness.repository.ElectionRepository
import kotlinx.coroutines.launch

class RepresentativeViewModel(private val repository: ElectionRepository, application: Application): BaseViewModel(application) {

    //TODO: Establish live data for representatives and address


    //TODO: Create function to fetch representatives from API from a provided address

    /**
     *  The following code will prove helpful in constructing a representative from the API. This code combines the two nodes of the RepresentativeResponse into a single official :

    val (offices, officials) = getRepresentativesDeferred.await()
    _representatives.value = offices.flatMap { office -> office.getRepresentatives(officials) }

    Note: getRepresentatives in the above code represents the method used to fetch data from the API
    Note: _representatives in the above code represents the established mutable live data housing representatives

     */

    init {
        viewModelScope.launch {

        }
    }

    //TODO: Create function get address from geo location

    //TODO: Create function to get address from individual fields

}

class RepresentativeViewModelFactory(private val repository: ElectionRepository, private val application: Application)  : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RepresentativeViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RepresentativeViewModel(repository, application) as T
        }
        throw IllegalArgumentException("Unable to construct RepresentativeViewModel")
    }
}
