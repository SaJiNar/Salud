package com.example.salud2.salud.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.Salud2.salud.R


data class Receta(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nombre: Int,
    val tiempo: Int,
    val ingredientes_y_pasos: String,
)

val recetas = listOf(
    Receta(
        R.drawable.ejemplo,
        R.string.receta_1,
        30,
        "Ingredientes:\n" +
                "1 ramillete de brócoli\n" +
                "1 huevo\n" +
                "150 g queso rallado (cheddar, mozarella...)\n" +
                "Especias e ingredientes para la pizza al gusto\n" +
                "\nPasos:\n" +
                "1. Lo primero que haremos será rallar la parte más verde y frondosa del brócoli con un rallador o procesador.\n" +
                "2. Cuando tengas listo el brócoli, añade un huevo batido y el queso rallado. Puedes ponerle un poco de sal y especias al gusto (ajo, cebolla, pimentón…)\n" +
                "3. Mezcla todo hasta que el huevo se impregne con el resto de ingredientes.\n" +
                "4. Prepara tu bandeja de horno con un papel vegetal y vuelca sobre ella tu masa haciendo una montañita.\n" +
                "5. Y ahora, con las manos aplastala a la vez que la vas estirando haciendo forma de pizza redonda de 1/2 cm de grosor aprox.\n" +
                "6. Cuando la tengas bien estirada y prensada, ponle por encima la salsa de tomate y todos tus ingredientes repartidos por la pizza.\n" +
                "7. Hornéala a 180º durante unos 15 minutos. Cada horno es diferente, por lo que el tiempo puede variar unos minutos más o menos. Los bordes deben quedar ligeramente dorados.\n" +
                "8. Pasado el tiempo ya tienes tu pizza lista para disfrutarla"
    ),
    Receta(
        R.drawable.ejemplo,
        R.string.receta_gazpacho_cerezas,
    25,
        "Ingredientes:\n" +
            "200 g de cerezas\n" +
            "1 kg de tomates pera\n" +
            "1 cebolleta o ½ cebolla\n" +
            "½ pimiento verde italiano\n" +
            "1 diente de ajo\n" +
            "10 g de vinagre de jerez\n" +
            "100 g de miga de pan\n" +
            "100 g de AOVE\n" +
            "Sal\n\n" +
            "Pasos:\n" +
            "1. Antes de nada, lavamos bien todos los ingredientes: los tomates, el pimiento, y las cerezas. Reservamos.\n" +
            "2. Cortamos los tomates en 4 o 6 trozos y los colocamos en un recipiente grande.\n" +
            "3. Picamos la cebolla y el pimiento en cuadraditos y los agregamos al recipiente.\n" +
            "4. Cortamos la miga de pan en cubos y la agregamos al recipiente junto con el ajo picado.\n" +
            "5. Agregamos el vinagre, el aceite de oliva y la sal al recipiente y removemos bien. Tapamos el recipiente con papel film y lo reservamos en la nevera por 3-8 horas.\n" +
            "6. En este tiempo, quitamos el hueso de las cerezas y las reservamos en la nevera.\n" +
            "7. Una vez que ha pasado el tiempo de maceración, trituramos la mezcla del recipiente en un robot de cocina. Agregamos las cerezas y seguimos triturando hasta obtener una textura deseada. Rectificamos de sal al gusto.\n" +
            "8. Guardamos el gazpacho en un tupper o en tarros en la nevera hasta que esté bien frío.\n")


)


