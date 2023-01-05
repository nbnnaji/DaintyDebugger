package com.nkechinnaji.buggypedia.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilders {

    const val UNIVERSITY_BASE_URL = "http://universities.hipolabs.com"

    fun buildClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                this.level = HttpLoggingInterceptor.Level.BODY
            })
            .build()

    fun getUniversitysRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(UNIVERSITY_BASE_URL)
            .client(buildClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}