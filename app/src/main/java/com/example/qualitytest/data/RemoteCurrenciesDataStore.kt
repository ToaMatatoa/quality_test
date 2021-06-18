package com.example.qualitytest.data

import com.example.qualitytest.model.CurrenciesList

class RemoteCurrenciesDataStore {

    private val retrofitCurrenciesService
            by lazy { RetrofitCurrenciesClient.currenciesWebService() }

    suspend fun getNewsList(): List<CurrenciesList> {
        return retrofitCurrenciesService.getCurrencies()
    }
}