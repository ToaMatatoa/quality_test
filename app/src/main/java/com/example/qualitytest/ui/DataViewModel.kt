package com.example.qualitytest.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.qualitytest.data.local.model.LocalFavouriteData
import com.example.qualitytest.domain.CurrenciesUseCase
import kotlinx.coroutines.launch

class DataViewModel (private val currenciesUseCase: CurrenciesUseCase) : ViewModel() {

    private val liveDataRemote = MutableLiveData<List<LocalFavouriteData>>()
    val liveDataRemoteProvider: LiveData<List<LocalFavouriteData>> = liveDataRemote

    fun getData() {
        viewModelScope.launch {
            liveDataRemote.postValue(currenciesUseCase.getData())
        }
    }
}