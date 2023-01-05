package com.nkechinnaji.buggypedia.data.api

import com.nkechinnaji.buggypedia.data.model.*
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/***
 * Api calling class
 */
interface ApiService {
    @GET("/api/vectors")
    suspend fun getAllBugs(): Response<BugsProfileResponse>

    @GET("/api/breeds/image/random")
    suspend fun getDogMessage(): Response<DogsResponse>

    @GET("/api/fruit/all")
    suspend fun getFruitsData(): Response<ArrayList<FruitsResponse>>

    @GET("/search")
    suspend fun getUniversityData(
        @Query("country")  country: String = ""
    ): Response<ArrayList<UniversityProfile>>
}