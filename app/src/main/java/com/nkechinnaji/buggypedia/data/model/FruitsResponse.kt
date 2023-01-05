package com.nkechinnaji.buggypedia.data.model

import com.google.gson.annotations.SerializedName

data class FruitsResponse(
    val allFruits: AllFruits? = null
)

data class AllFruits(
    @SerializedName("genus")
    val genus: String? = null,

    @SerializedName("name")
    val name: String,

    @SerializedName("id")
    val id: Int,

    @SerializedName("family")
    val family: String? = null,

    @SerializedName("order")
    val order: String,

    @SerializedName("nutritions")
    val nutritions: Nutritions
)
data class Nutritions(
    val carbohydrates: Double,
    val protein: Long,
    val fat: Double,
    val calories: Long,
    val sugar: Double
)