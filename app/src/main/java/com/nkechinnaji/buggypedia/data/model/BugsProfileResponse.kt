package com.nkechinnaji.buggypedia.data.model

import com.google.gson.annotations.SerializedName


data class BugsProfileResponse(
    @SerializedName("count")
    val count: Int? = null,

    @SerializedName("results")
    val results: List<Results> = listOf()

)


data class Results(
    @SerializedName("ID")
    val id: Int? = null,

    @SerializedName("data")
    val data: Data? = null
)


data class Data(
    @SerializedName("descriptionSize")
    val desc: String? = null,

    @SerializedName("pathogens")
    val pathogens: List<Pathogens> = listOf(),

    @SerializedName("country")
    val country: List<String> = listOf(),

    @SerializedName("distribution")
    val distr: String? = null,

    @SerializedName("continent")
    val continent: List<String> = listOf(),

    @SerializedName("image")
    var image: Image? = null,

    @SerializedName("genus")
    val genus: String? = null,

    @SerializedName("specificepithet")
    val specificepithet: String? = null,

    @SerializedName("infraspecificepithet")
    val infraspecificepithet: String? = null,

    @SerializedName("scientificnameauthority")
    val scientificnameauthority: String? = null,

    @SerializedName("suborder")
    val suborder: String? = null,

    @SerializedName("superfamily")
    val superfamily: String? = null,

    @SerializedName("family")
    val family: String? = null,

    @SerializedName("subfamily")
    val subfamily: String? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("ukstatus")
    val ukstatus: String? = null,

    @SerializedName("crops")
    val crops: List<String> = listOf(),

    @SerializedName("ukvectorstatus")
    val ukvectorstatus: String? = null,

    @SerializedName("introduction")
    val introduction: String? = null,

    @SerializedName("ukdistribution")
    val ukdistribution: String? = null,

    @SerializedName("peststatus")
    val peststatus: String? = null,

    @SerializedName("ecology")
    val ecology: String? = null,

    @SerializedName("descriptionBody")
    val descriptionBody: String? = null,

    @SerializedName("descriptionGenitalia")
    val descriptionGenitalia: String? = null,

    @SerializedName("diagnosis")
    val diagnosis: String? = null,

    @SerializedName("diseases")
    val diseases: Diseases? = null
)


data class Pathogens(
    @SerializedName("name")
    val name: String? = null,

    @SerializedName("type")
    val type: String,

    @SerializedName("value")
    val value: Value? = null

)


data class Value(
    @SerializedName("diseasesRecid")
    val diseasesRecid: Long? = null,

    @SerializedName("citation")
    val citation: List<Citation> = listOf(),

    @SerializedName("slug")
    val slug: String? = null,

    @SerializedName("diseasename")
    val diseasename: String? = null,

    @SerializedName("diseaseGroups")
    val diseaseGroups: DiseaseGroups? = null,

    @SerializedName("pathogenType")
    val pathogenType: PathogenType? = null
)


data class Citation(
    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("slug")
    val slug: String? = null,

    @SerializedName("pubtitle")
    val pubtitle: String? = null,

    @SerializedName("publisher")
    val publisher: String? = null,

    @SerializedName("issue")
    val issue: String? = null,

    @SerializedName("pages")
    val pages: String? = null,

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("urlaccessed")
    val urlaccessed: String? = null,

    @SerializedName("format")
    val format: String? = null
)


data class DiseaseGroups(
    @SerializedName("xylella-fastidiosa")
    val xylellaFastidiosa: String? = null
)


data class PathogenType (
    val bacteria: String? = null
)


data class Image(
    @SerializedName("filename")
    val fileName: String? = null,

    @SerializedName("path")
    val path: String? = null,

    @SerializedName("media")
    val media: Int? = null,

    @SerializedName("thumbnail")
    val thumbNail: String? = null,

    @SerializedName("fieldName")
    val fieldName: String? = null,

    @SerializedName("alt")
    val alt: String? = null,

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("extension")
    val extension: String? = null,


    )


data class Diseases(
    @SerializedName("xylella-fastidiosa")
    val xylella_fastidiosa: String? = null,

    @SerializedName("pierce-s-disease")
    val pierce_s_disease: String? = null,

    @SerializedName("citrus-variegated-chlorosis")
    val citrus_variegated_chlorosis: String? = null,

    @SerializedName("almond-leaf-scorch")
    val almond_leaf_scorch: String? = null,

    @SerializedName("phony-peach-disease")
    val phony_peach_disease: String? = null,

    @SerializedName("oleander-leaf-scorch")
    val oleander_leaf_scorch: String? = null,

    @SerializedName("bacterial-leaf-scorch")
    val bacterial_leaf_scorch: String? = null,

    @SerializedName("ragweed-stunt")
    val ragweed_stunt: String? = null

)
