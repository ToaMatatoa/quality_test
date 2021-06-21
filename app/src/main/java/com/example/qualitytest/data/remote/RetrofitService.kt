package com.example.qualitytest.data.remote

import com.example.qualitytest.data.remote.model.ResponseData
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {

    @GET("latest")
    suspend fun getCurrenciesAsync(): List<ResponseData.Data>
}