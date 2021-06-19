package com.example.qualitytest.data.remote

import com.example.qualitytest.data.remote.model.ResponseCurrenciesData

class RemoteRepository(private val remoteDataStore: RemoteCurrenciesDataStore) {

    suspend fun getCurrenciesList() : List<ResponseCurrenciesData> {
        return remoteDataStore.getCurrenciesList()
    }
}