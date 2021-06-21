package com.example.qualitytest.domain

import com.example.qualitytest.data.local.LocalDataStore
import com.example.qualitytest.data.local.model.LocalFavouriteData
import com.example.qualitytest.data.remote.RemoteDataStore
import com.example.qualitytest.data.remote.model.ResponseData
import retrofit2.Response

class Repository(
    private val remoteDataStore: RemoteDataStore,
    private val localDataStore: LocalDataStore
) {

    suspend fun getCurrenciesList(): List<ResponseData.Data> {
        return remoteDataStore.getCurrenciesList()
    }

    suspend fun getAllLocalData(): List<LocalFavouriteData> = localDataStore.getAllLocalData()

    suspend fun saveLocalData(localFavouriteData: List<LocalFavouriteData>) {
        localDataStore.saveLocaleData(localFavouriteData)
    }
}