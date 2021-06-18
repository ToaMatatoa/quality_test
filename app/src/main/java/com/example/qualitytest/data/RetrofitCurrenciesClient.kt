package com.example.qualitytest.data

import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitCurrenciesClient {

    private const val newsURL = "https://api.exchangerate.host/"

    fun currenciesWebService(): RetrofitCurrenciesService {

        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val retrofit = Retrofit.Builder()
            .baseUrl(newsURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(RetrofitCurrenciesService::class.java)
    }
}