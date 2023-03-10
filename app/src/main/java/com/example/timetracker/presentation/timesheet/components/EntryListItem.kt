package com.example.timetracker.presentation.timesheet.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun EntryListItem(
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
                .padding(Paddings.PADDING_24)
        ) {
            LabelValueComponent(
                modifier, stringResource(id = R.string.project_label), "PROJ"
            )
            Row {
                LabelValueComponent(
                    modifier,
                    stringResource(id = R.string.hours_label),
                    pluralStringResource(id = R.plurals.tracked_hours, 1, 1)
                )
                Spacer(modifier = Modifier.width(Dimens.DIMEN_16))
                LabelValueComponent(
                    modifier, stringResource(id = R.string.date_label), "20/03/2023"
                )
            }
        }
    }
}

@Preview
@Composable
fun EntryListItemPreview() {
    EntryListItem()
}