package com.example.datos_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btEnviar.setOnClickListener{



            var Nombre:String=etNombre.text.toString()

            var Renta:String=etSueldo.text.toString()


          var Rentaaplicada:Double=Renta.toDouble()
            var Calculo:Double = Rentaaplicada*0.10

var resultado:String=Calculo.toString()

            val intent: Intent=Intent(this@MainActivity, recibir_datos::class.java)

            intent.putExtra("nombre", Nombre)



            intent.putExtra("renta", resultado)

            startActivity(intent)

        }
    }
    }
