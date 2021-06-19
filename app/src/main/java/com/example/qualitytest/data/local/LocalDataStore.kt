package com.example.qualitytest.data.local

import com.example.qualitytest.data.local.model.LocalFavouriteData

class LocalDataStore(private val localDataDao: LocalDataDao) {

    suspend fun getAllLocalData(): List<LocalFavouriteData> = localDataDao.getAllLocalData()

    suspend fun saveLocaleData(localFavouriteData: List<LocalFavouriteData>) {
        localDataDao.saveAllLocalData(localFavouriteData)
    }
}