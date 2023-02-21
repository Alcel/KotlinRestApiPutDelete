package com.example.kotlinrestapiputdelete

import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestApiService {


        private val retrofit = Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8080/api/") // change this IP for testing by your actual machine IP
            .addConverterFactory(GsonConverterFactory.create())
            .build()






}