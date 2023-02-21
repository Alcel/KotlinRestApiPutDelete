package com.example.restapimodificacionkotlin


import com.example.kotlinrestapiputdelete.Inmueble
import com.example.kotlinrestapiputdelete.RetrofitClient
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.POST
import retrofit2.http.Path


interface RestApi {
    @POST("inmuebles")

    fun addUser(@Body userData: Inmueble): Call<Inmueble>

    @DELETE("inmuebles/{id}")
    fun deleteItem(@Path("id") itemId: Int): Call<Inmueble>?
    object Utils {
        val BASE_URL = "http://10.0.2.2:8080/api/"

        val apiService: RestApi
            get() = RetrofitClient.getClient(BASE_URL)!!.create(RestApi::class.java)
    }
}