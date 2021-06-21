package com.example.qualitytest.domain

import com.example.qualitytest.data.remote.model.ResponseData

class UseCase(
    private val repository: Repository
) {

    suspend fun getCurrenciesList(): List<ResponseData.Data> {
        return repository.getCurrenciesList()
    }
}