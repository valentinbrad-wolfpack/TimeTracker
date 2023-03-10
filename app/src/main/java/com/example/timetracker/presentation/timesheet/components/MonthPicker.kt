package com.example.timetracker.presentation.timesheet.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.timetracker.R
import com.example.timetracker.presentation.ui.theme.DarkGray
import com.example.timetracker.presentation.ui.theme.Paddings
import com.example.timetracker.presentation.ui.theme.Shapes
import com.example.timetracker.presentation.ui.theme.TextSizes
import com.example.timetracker.presentation.ui.theme.White
import com.example.timetracker.presentation.ui.theme.fonts

@Composable
fun MonthPicker(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = Paddings.PADDING_32),
        shape = Shapes.large,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Row(
            modifier = modifier
                .fillMaxSize()
                .padding(vertical = Paddings.PADDING_12),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = modifier.padding(start = Paddings.PADDING_32),
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = null
            )
            Row {
                Image(
                    painter = painterResource(id = R.drawable.ic_small_calendar),
                    contentDescription = null
                )
                Text(
                    modifier = Modifier.padding(start = Paddings.PADDING_12),
                    text = stringResource(id = R.string.month_year, "February", 2023),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Image(
                modifier = modifier.padding(end = Paddings.PADDING_32),
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = null
            )
        }
    }
}