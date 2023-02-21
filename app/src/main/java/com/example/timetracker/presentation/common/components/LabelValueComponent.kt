package com.example.timetracker.presentation.common.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.timetracker.presentation.ui.theme.Gray
import com.example.timetracker.presentation.ui.theme.TextSizes
import com.example.timetracker.presentation.ui.theme.White
import com.example.timetracker.presentation.ui.theme.fonts

@Composable
fun LabelValueComponent(
    modifier: Modifier = Modifier, label: String, value: String
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = label, style = TextStyle(
                fontFamily = fonts,
                fontWeight = FontWeight.Normal,
                fontSize = TextSizes.SIZE_10,
                color = Gray
            )
        )
        Text(
            text = value, style = TextStyle(
                fontFamily = fonts,
                fontWeight = FontWeight.Bold,
                fontSize = TextSizes.SIZE_16,
                color = White
            )
        )
    }
}