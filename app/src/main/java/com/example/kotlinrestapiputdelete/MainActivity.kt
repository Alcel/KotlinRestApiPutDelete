package com.example.kotlinrestapiputdelete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.restapimodificacionkotlin.RestApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val restApi:RestApi?=null

        //annadir()
        //delete(1)
    }
    fun annadir(){
        var mAPIService: RestApi? = null
        val userInfo = Inmueble("Pisito a pie de playa",
            80822.0,
            "Pisito muy mono con grandes oportunidades, perteneciente a mi fallecida Paca. ¡Hay Paca! ",
            70,
            55,
            "Jaen,Malasangre Calle Camilo Sesto nº76",
            "Parque industrial de Malasangre",
            "2023-03-04",
            1,
            0,
            55)


        //After oncreate

        mAPIService = RestApi.Utils.apiService

        //Some Button click

        mAPIService!!.addUser(userInfo).enqueue(object :
            Callback<Inmueble> {

            override fun onResponse(call: Call<Inmueble>, response: Response<Inmueble>) {

              //  Log.i("", "post submitted to API." + response.body()!!)

                if (response.isSuccessful()) {

                    Log.i("", "post registration to API" + response.body()!!.toString())


                }
            }

            override fun onFailure(call: Call<Inmueble>, t: Throwable) {
                println("HAHAA")
            }
        })

    }
    fun delete(inter:Int){
        var mAPIService: RestApi? = null



        //After oncreate

        mAPIService = RestApi.Utils.apiService

        //Some Button click

        mAPIService!!.deleteItem(inter)?.enqueue(object :
            Callback<Inmueble> {

            override fun onResponse(call: Call<Inmueble>, response: Response<Inmueble>) {

                //  Log.i("", "post submitted to API." + response.body()!!)

                if (response.isSuccessful()) {

                    Log.i("", "post registration to API" + response.body()!!.toString())


                }
            }

            override fun onFailure(call: Call<Inmueble>, t: Throwable) {
                println("HAHAA")
            }
        })

    }
}