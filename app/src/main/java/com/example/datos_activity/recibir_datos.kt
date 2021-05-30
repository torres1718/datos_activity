package com.example.datos_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_recibir_datos.*

class recibir_datos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recibir_datos)

        val bundle=intent.extras


        var Nombre=bundle?.getString("nombre")

        var Renta=bundle?.getString("renta")

        tvMostrarRenta.text="Bienvenido $Nombre su renta es de $Renta"


    }

    fun volver(view: View) {
        intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }


}