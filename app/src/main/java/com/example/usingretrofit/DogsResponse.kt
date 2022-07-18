package com.example.usingretrofit

import com.google.gson.annotations.SerializedName

data class DogsResponse(
    @SerializedName("status") val status : String,
    @SerializedName("message") val dogList : List<String>
)
