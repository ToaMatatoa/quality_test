package com.example.qualitytest.data.local

import com.example.qualitytest.data.local.model.LocalFavouriteData

class LocalRepository(private val localDataStore: LocalDataStore) {

    suspend fun getAllLocalData(): List<LocalFavouriteData> = localDataStore.getAllLocalData()

    suspend fun saveLocalData(localFavouriteData: List<LocalFavouriteData>) {
        localDataStore.saveLocaleData(localFavouriteData)
    }
}