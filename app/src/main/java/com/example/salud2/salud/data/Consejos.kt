package com.example.salud2.salud.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.Salud2.salud.R

data class Consejo(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nombre: Int,
    val consejos: String
)

val consejos = listOf(
    Consejo(R.drawable.ejemplo, R.string.consejo_1,"ejemplo de consejo (dormir mejor)"),

    )