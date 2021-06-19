package com.example.qualitytest.data.remote

import com.example.qualitytest.data.remote.model.ResponseCurrenciesData
import retrofit2.http.GET

interface RetrofitCurrenciesService {

    @GET("latest")
    suspend fun getCurrencies(): List<ResponseCurrenciesData>
}