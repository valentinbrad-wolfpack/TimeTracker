package com.example.timetracker.presentation.timesheet.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.timetracker.R
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Paddings
import com.example.timetracker.presentation.ui.theme.Shapes
import com.example.timetracker.presentation.ui.theme.White

@Composable
fun MissingHoursSection(
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier.padding(horizontal = Paddings.PADDING_40),
        text = stringResource(id = R.string.missing_hours_for, "Wed 04"),
        style = MaterialTheme.typography.headlineSmall,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.primary
    )
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(Dimens.DIMEN_56)
            .padding(horizontal = Paddings.PADDING_40),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
        ),
        shape = Shapes.large, onClick = {}
    ) {
        Text(
            modifier = Modifier.background(
                color = Color.Transparent, shape = Shapes.large
            ),
            text = stringResource(id = R.string.add_now),
            color = White,
            style = MaterialTheme.typography.labelSmall
        )
    }
}