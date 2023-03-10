package com.example.timetracker.presentation.holiday.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.timetracker.R
import com.example.timetracker.presentation.common.components.LabelValueComponent
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Paddings
import com.example.timetracker.presentation.ui.theme.TopShapes

@Composable
fun HolidayListItem(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = TopShapes.large
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            MaterialTheme.colorScheme.surface,
                            MaterialTheme.colorScheme.background
                        )
                    )
                )
                .padding(vertical = Paddings.PADDING_16, horizontal = Paddings.PADDING_24)
        ) {
            Text(
                text = "Pending",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.tertiaryContainer
            )
            Spacer(modifier = Modifier.height(Dimens.DIMEN_12))
            Row {
                LabelValueComponent(
                    modifier,
                    stringResource(id = R.string.dates_label),
                    stringResource(
                        id = R.string.start_end_date,
                        "31/12/2021",
                        "3/1/2022"
                    )
                )
                Spacer(modifier = Modifier.width(Dimens.DIMEN_24))
                LabelValueComponent(
                    modifier,
                    stringResource(id = R.string.days_label),
                    pluralStringResource(id = R.plurals.days, 2, 2)
                )
            }
            Spacer(modifier = Modifier.height(Dimens.DIMEN_12))
            LabelValueComponent(
                modifier,
                stringResource(id = R.string.description_label), "Some description"
            )
        }
    }
}

@Preview
@Composable
fun HolidayListItemPreview() {
    HolidayListItem()
}
