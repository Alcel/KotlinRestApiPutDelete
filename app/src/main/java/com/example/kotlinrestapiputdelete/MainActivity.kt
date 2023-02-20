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
        val userInfo = Inmueble(titulo = "Pisito a pie de playa",
             precio = 80822f,
             descripcion = "Pisito muy mono con grandes oportunidades, perteneciente a mi fallecida Paca. ¡Hay Paca! ",
             metrosConstruidos = 70,
             metrosUtiles = 55,
             ubicacion = "Jaen,Malasangre Calle Camilo Sesto nº76",
             zona ="Parque industrial de Malasangre",
             fechaPublicacion ="2023-03-04",
             habitaciones = 1,
             bannos = 0,
             idInmueble = 55)

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