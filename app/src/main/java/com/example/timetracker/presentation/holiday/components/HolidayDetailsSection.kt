package com.example.timetracker.presentation.holiday.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.timetracker.R
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Paddings
import com.example.timetracker.presentation.ui.theme.Shapes
import com.example.timetracker.presentation.ui.theme.White

@Composable
fun HolidayDetailsSection(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = R.drawable.bg_holidays),
        contentDescription = null,
        modifier = modifier
            .wrapContentSize()
            .padding(horizontal = Paddings.PADDING_40)
    )
    Spacer(modifier = Modifier.height(Dimens.DIMEN_12))
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
            text = stringResource(id = R.string.add_your_holiday),
            color = White,
            style = MaterialTheme.typography.labelSmall
        )
    }
    Spacer(modifier = Modifier.height(Dimens.DIMEN_24))
    Text(
        modifier = modifier.padding(horizontal = Paddings.PADDING_40),
        text = stringResource(id = R.string.days_used, 3),
        style = MaterialTheme.typography.bodySmall,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.onBackground
    )
    Text(
        modifier = modifier.padding(horizontal = Paddings.PADDING_40),
        text = stringResource(id = R.string.days_left, 22),
        style = MaterialTheme.typography.bodySmall,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.onBackground
    )
    Text(
        modifier = modifier.padding(horizontal = Paddings.PADDING_40),
        text = stringResource(id = R.string.days_available_now, 4),
        style = MaterialTheme.typography.headlineSmall,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.onBackground
    )
}