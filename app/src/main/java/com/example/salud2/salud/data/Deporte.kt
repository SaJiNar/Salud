package com.example.salud2.salud.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.Salud2.salud.R


data class Deporte(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nombre: Int,
    val tiempo: Int,
    val ejercicios: String
)

val deportes = listOf(
    Deporte(R.drawable.ejemplo, R.string.rutina_1, 30 ,"Ejemplo de ejercicio"),

)