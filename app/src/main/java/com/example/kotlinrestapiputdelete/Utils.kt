package com.example.kotlinrestapiputdelete

import com.example.restapimodificacionkotlin.RestApi
import okhttp3.OkHttpClient

object Utils {
    val BASE_URL = "http://localhost:8080/api/"

    val apiService: RestApi
        get() = RetrofitClient.getClient(BASE_URL)!!.create(RestApi::class.java)




}