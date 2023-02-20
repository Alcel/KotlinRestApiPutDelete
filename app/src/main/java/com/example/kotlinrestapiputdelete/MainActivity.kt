package com.example.kotlinrestapiputdelete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addDummyInmueble()
    }
    fun addDummyInmueble() {
        val apiService = RestApiService()
        val userInfo = Inmueble("Pisito a pie de playa",
             80822f,
             "Pisito muy mono con grandes oportunidades, perteneciente a mi fallecida Paca. ¡Hay Paca! ",
             70,
              55,
             "Jaen,Malasangre Calle Camilo Sesto nº76",
             "Parque industrial de Malasangre",
             "2023-03-04",
              1,
              0,
              55)

        apiService.addUser(userInfo) {
            if (it?.idInmueble != null) {
                // it = newly added user parsed as response
                // it?.id = newly added user ID
            } else {
                println("Error registering new user")
            }
        }
    }
}