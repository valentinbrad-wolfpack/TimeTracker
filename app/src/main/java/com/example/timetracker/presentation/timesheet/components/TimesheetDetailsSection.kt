package com.example.timetracker.presentation.timesheet.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.timetracker.R
import com.example.timetracker.presentation.ui.theme.Paddings

@Composable
fun TimesheetDetailsSection(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = R.drawable.bg_timesheet),
        contentDescription = null,
        modifier = modifier
            .wrapContentSize()
            .padding(horizontal = Paddings.PADDING_40)
    )
    Text(
        modifier = modifier.padding(horizontal = Paddings.PADDING_40),
        text = stringResource(id = R.string.time_so_far),
        style = MaterialTheme.typography.bodySmall,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.secondary
    )
    Text(
        modifier = modifier.padding(horizontal = Paddings.PADDING_40),
        text = stringResource(id = R.string.tracked_time, 100, 108),
        style = MaterialTheme.typography.headlineLarge,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.onBackground
    )
    Text(
        modifier = modifier.padding(horizontal = Paddings.PADDING_40),
        text = stringResource(id = R.string.expected_hours_per_day, 8),
        style = MaterialTheme.typography.bodySmall,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.secondary
    )
}