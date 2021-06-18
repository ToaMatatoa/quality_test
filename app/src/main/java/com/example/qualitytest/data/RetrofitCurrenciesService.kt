package com.example.qualitytest.data

import com.example.qualitytest.model.CurrenciesList
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitCurrenciesService {

    @GET("latest")
    suspend fun getCurrencies(): List<CurrenciesList>
}