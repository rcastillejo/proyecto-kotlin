package com.example.proyectokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

data class Curso (val nombre:String, val url:String)


class MainActivity : AppCompatActivity() {

    val react = Curso("React", "react")
    val kot = Curso("Kotlin", "kot")
    var cursoActual = react;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val boton = findViewById<Button>(R.id.boton)

        boton.setOnClickListener {
            view -> switchCurso()
        }
    }

    private fun switchCurso() {
        when(cursoActual.url){
            "react"-> cursoActual = kot
            "kot"-> cursoActual = react
            else -> print("Esto no va a pasar")
        }

        val texto = findViewById<TextView>(R.id.texto)
        texto.text = "Hola Ricardo, tienes los cursos: ${cursoActual.nombre} en ${cursoActual.url}"
    }
}
