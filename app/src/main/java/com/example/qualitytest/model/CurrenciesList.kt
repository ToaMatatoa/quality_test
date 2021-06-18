package com.example.qualitytest.model

import com.google.gson.annotations.SerializedName

data class CurrenciesList(
    @SerializedName("rates") var rates: List<String>
)