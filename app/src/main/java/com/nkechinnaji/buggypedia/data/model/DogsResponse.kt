package com.nkechinnaji.buggypedia.data.model

import com.google.gson.annotations.SerializedName

data class DogsResponse(
    @SerializedName("message")
    val message: String? = null,

    @SerializedName("status")
    val status: String? = null
)
