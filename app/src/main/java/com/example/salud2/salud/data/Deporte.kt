package com.example.salud2.salud.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.Salud2.salud.R


data class deporte(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nombre: Int,
    val tiempo: Int,
    @StringRes val ejercicios: Int
)

val deportes = listOf(
    deporte(R.drawable.ejemplo, R.string.rutina_1, R.string.tiempo_1, R.string.ejercicio_1),

)