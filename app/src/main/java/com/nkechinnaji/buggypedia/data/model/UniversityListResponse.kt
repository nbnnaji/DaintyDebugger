package com.nkechinnaji.buggypedia.data.model

import com.google.gson.annotations.SerializedName

data class UniversityListResponse(
   val universityProfile: UniversityProfile ? = null
)

data class UniversityProfile(
    @SerializedName("name")
    val name: String? = null,

    @SerializedName("alpha_two_code")
    val alphaTwoCode: String,

    @SerializedName("web_pages")
    val webPages: List<String>,

    @SerializedName("state-province")
    val stateProvince: Any? = null,

    @SerializedName("domains")
    val domains: List<String>,

    @SerializedName("country")
    val country: String
)
