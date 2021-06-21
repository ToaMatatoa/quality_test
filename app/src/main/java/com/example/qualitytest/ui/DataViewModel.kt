package com.example.qualitytest.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.qualitytest.data.remote.model.ResponseData
import com.example.qualitytest.domain.UseCase
import kotlinx.coroutines.launch

class DataViewModel (private val useCase: UseCase) : ViewModel() {

    private val liveDataRemote = MutableLiveData<List<ResponseData.Data>>()

    fun getData() {
        viewModelScope.launch {
            liveDataRemote.postValue(useCase.getCurrenciesList())
        }
    }
}