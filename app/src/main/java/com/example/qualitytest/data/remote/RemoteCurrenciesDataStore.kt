package com.example.qualitytest.data.remote

import com.example.qualitytest.data.remote.model.ResponseCurrenciesData

class RemoteCurrenciesDataStore {

    private val retrofitCurrenciesService
            by lazy { RetrofitCurrenciesClient.currenciesWebService() }

    suspend fun getCurrenciesList(): List<ResponseCurrenciesData> {
        return retrofitCurrenciesService.getCurrencies()
    }
}