package com.example.qualitytest.data.remote

import com.example.qualitytest.data.remote.model.ResponseData
import retrofit2.Response

class RemoteDataStore {

    private val retrofitCurrenciesService
            by lazy { RetrofitClient.currenciesWebService() }

    suspend fun getCurrenciesList(): List<ResponseData.Data> {
        return retrofitCurrenciesService.getCurrenciesAsync()
    }
}