package com.example.android.politicalpreparedness.representative

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.example.android.politicalpreparedness.base.BaseViewModel
import com.example.android.politicalpreparedness.election.ElectionsViewModel
import com.example.android.politicalpreparedness.network.models.Address
import com.example.android.politicalpreparedness.repository.ElectionRepository
import com.example.android.politicalpreparedness.utils.isNetworkAvailable
import kotlinx.coroutines.launch
import java.io.IOException

class RepresentativeViewModel(
    private val repository: ElectionRepository,
    application: Application
) : BaseViewModel(application) {

    //Establish live data for representatives and address
    private val _address = MutableLiveData<Address>(Address("", "", "", "", ""))
    val address: LiveData<Address>
        get() = _address


    private val _isNetworkAvailable = MutableLiveData<Boolean>(false)
    val isNetworkAvailable: LiveData<Boolean>
        get() = _isNetworkAvailable

    // Create function to fetch representatives from API from a provided address
    val representatives = repository.representatives

    init {
        viewModelScope.launch {
            _isNetworkAvailable.value = isNetworkAvailable(application)
        }
    }

    fun getRepresentativesByAddress(address: Address) {
        viewModelScope.launch {
            try {
                repository.refreshRepresentatives(address.toFormattedString())
            } catch (e: Exception) {
                e.message?.let {
                    showErrorMessage.value = e.message
                }
            }
        }
    }

    fun setAddress(address: Address) {
        _address.value = address
    }

}

class RepresentativeViewModelFactory(
    private val repository: ElectionRepository,
    private val application: Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RepresentativeViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RepresentativeViewModel(repository, application) as T
        }
        throw IllegalArgumentException("Unable to construct RepresentativeViewModel")
    }
}
