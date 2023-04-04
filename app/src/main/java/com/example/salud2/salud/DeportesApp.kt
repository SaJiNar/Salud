package com.example.salud2.salud

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.Salud2.salud.R
import com.example.salud2.salud.data.Deporte


@Composable
fun DeporteItem(deporte: Deporte, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Box(modifier = modifier.padding(10.dp)) {
        Card(elevation = 6.dp) {
            Column(modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
                .padding(vertical = 4.dp, horizontal = 12.dp) // Ajusta el padding vertical y horizontal
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {
                    DeporteIcon(deporte.imageResourceId)
                    Spacer(modifier = Modifier.width(10.dp))
                    DeporteInformacion(deporte.nombre, deporte.tiempo)
                    Spacer(modifier = Modifier.weight(1f))
                    DeporteItemButton(
                        expanded = expanded,
                        onClick = { expanded = !expanded },
                    )
                }
                if (expanded) {
                    Text(text = deporte.ejercicios,
                        modifier = Modifier.padding(vertical = 8.dp), // Ajusta el padding vertical
                        fontSize = 18.sp // Ajusta el tamaño del texto
                    )
                }
            }
        }
    }
}

@Composable
private fun DeporteItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(48.dp)
    ) {
        Icon(
            imageVector = if
                    (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            tint =
            MaterialTheme.colors.secondary,
            contentDescription =
            stringResource(R.string.expand_button_content_description),
        )
    }
}

@Composable
fun DeporteIcon(@DrawableRes deporteIcon: Int, modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier) {
    Image(
        modifier = modifier
            .size(64.dp)
            .padding(4.dp)
            .clip(RoundedCornerShape(25)),
        contentScale = ContentScale.Crop,
        painter = painterResource(deporteIcon),
        /*
         * Content Description is not needed here - image is decorative, and setting a null content
         * description allows accessibility services to skip this element during navigation.
         */
        contentDescription = null
    )
}

@Composable
fun DeporteInformacion(@StringRes deporteNombre: Int, minutos: Int, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = stringResource(deporteNombre),
            style = MaterialTheme.typography.h2,
            modifier = modifier.padding(top = 8.dp)
        )
        Text(
            text = stringResource(R.string.tiempo, minutos),
            style = MaterialTheme.typography.body1
        )
    }
}