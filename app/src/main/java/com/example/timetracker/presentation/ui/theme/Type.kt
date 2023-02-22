package com.example.timetracker.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

val Typography = Typography(
    headlineSmall = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = TextSizes.SIZE_14
    ),
    headlineMedium = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = TextSizes.SIZE_24
    ),
    headlineLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = TextSizes.SIZE_32
    ),
    bodySmall = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = TextSizes.SIZE_10
    ),
    bodyMedium = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = TextSizes.SIZE_16
    ),
    bodyLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = TextSizes.SIZE_16
    ),
    labelSmall = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = TextSizes.SIZE_14
    ),
    labelMedium = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = TextSizes.SIZE_16
    )
)
