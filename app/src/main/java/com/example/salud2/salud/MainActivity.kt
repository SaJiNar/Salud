package com.example.salud2.salud

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.Salud2.salud.R
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.sp
import com.example.salud2.salud.data.Receta
import com.example.salud2.salud.data.recetas
import com.example.salud2.salud.theme.SaludTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* setContent {
            SaludTheme {
                SaludApp(recetas)
            }
        }*/
        setContentView(R.layout.inicio)

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            // Aquí se ejecuta el código al hacer clic en el botón 1
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            // Aquí se ejecuta el código al hacer clic en el botón 2
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            // Aquí se ejecuta el código al hacer clic en el botón 3
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            // Aquí se ejecuta el código al hacer clic en el botón 4
        }
    }


    @Composable
    fun SaludApp(recetas: List<Receta>) {
        LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background)) {
            items(recetas) {
                RecetaItem(receta = it)
            }
        }
    }


    @Composable
    fun SaludTopAppBar(modifier: Modifier = Modifier) {
        Row {
            Image(
                painter = painterResource(R.drawable.ejemplo),
                contentDescription = null
            )
            Text(
                text = stringResource(R.string.app_name)
            )
        }
    }


    @Preview
    @Composable
    fun SaludPreview() {
        SaludTheme(darkTheme = false) {
            SaludApp(recetas)
        }
    }

    @Preview
    @Composable
    fun DarkThemePreview() {
        SaludTheme(darkTheme = true) {
            SaludApp(recetas)

        }
    }
}