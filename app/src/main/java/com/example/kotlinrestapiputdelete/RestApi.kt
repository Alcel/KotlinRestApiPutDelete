package com.example.restapimodificacionkotlin


import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface RestApi {
    @POST("inmuebles")

    fun addUser(@Body userData: Inmueble): Call<Inmueble>
    object Utils {
        val BASE_URL = "http://10.0.2.2:8080/api/"

        val apiService: RestApi
            get() = RetrofitClient.getClient(BASE_URL)!!.create(RestApi::class.java)
    }
}