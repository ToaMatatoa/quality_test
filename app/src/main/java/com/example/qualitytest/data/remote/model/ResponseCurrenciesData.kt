package com.example.qualitytest.data.remote.model

import com.google.gson.annotations.SerializedName

data class ResponseCurrenciesData(
    @SerializedName("rates") var rates: List<String>
)