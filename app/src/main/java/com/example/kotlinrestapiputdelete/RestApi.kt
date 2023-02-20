package com.example.kotlinrestapiputdelete

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestApi {

    @POST("/api/inmuebles")
    fun addUser(@Body userData: Inmueble): Call<Inmueble>
}