package com.example.qualitytest.domain

import com.example.qualitytest.data.local.LocalRepository
import com.example.qualitytest.data.local.model.LocalFavouriteData
import com.example.qualitytest.data.remote.RemoteRepository

class CurrenciesUseCase(
    private val remoteRepository: RemoteRepository,
    private val localRepository: LocalRepository
) {

//    suspend fun getData(): List<LocalFavouriteData> {
//        return try {
//            val remoteData = remoteRepository.getCurrenciesList()
//            val localData = remoteData.map { it.toLocalData() }
//            localRepository.saveLocalData(localData)
//
//            remoteData
//            localData
//        } catch (e: Exception) {
//            val localData = localRepository.getAllLocalData()
//
//            localData
//        }
//    }
}