package com.example.kotlinrestapiputdelete

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class RestApiService {
    fun addUser(userData: Inmueble, onResult: (Inmueble?) -> Unit){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.addUser(userData).enqueue(
            object : Callback<Inmueble> {
                override fun onFailure(call: Call<Inmueble>, t: Throwable) {
                    onResult(null)
                }
                override fun onResponse( call: Call<Inmueble>, response: Response<Inmueble>) {
                    val addedUser = response.body()
                    onResult(addedUser)
                }
            }
        )
    }
}