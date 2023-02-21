package com.example.timetracker.presentation.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes

val Shapes = Shapes(
    small = RoundedCornerShape(Radius.RADIUS_8),
    medium = RoundedCornerShape(Radius.RADIUS_16),
    large = RoundedCornerShape(Radius.RADIUS_28)
)

val TopShapes = Shapes(
    small = RoundedCornerShape(topStart = Radius.RADIUS_8, topEnd = Radius.RADIUS_8),
    medium = RoundedCornerShape(topStart = Radius.RADIUS_16, topEnd = Radius.RADIUS_16),
    large = RoundedCornerShape(topStart = Radius.RADIUS_24, topEnd = Radius.RADIUS_24)
)