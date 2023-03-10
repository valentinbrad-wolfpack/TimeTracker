package com.example.timetracker.presentation.common.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.timetracker.R
import com.example.timetracker.presentation.ui.theme.BottomShapes
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Paddings

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: String? = null,
    onProfileClicked: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .graphicsLayer {
                shape = BottomShapes.large
                clip = true
            }
            .border(
                width = Dimens.DIMEN_1,
                shape = BottomShapes.large,
                color = MaterialTheme.colorScheme.surface
            )
            .padding(
                bottom = Paddings.PADDING_20,
                top = Paddings.PADDING_32,
                start = Paddings.PADDING_32,
                end = Paddings.PADDING_32
            )
    ) {
        title?.let {
            Text(
                text = title,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Start
            )
        }
        Image(painter = painterResource(id = R.drawable.ic_user_profile),
            contentDescription = null,
            modifier = Modifier
                .size(Dimens.DIMEN_32)
                .align(Alignment.CenterVertically)
                .clickable { onProfileClicked.invoke() })
    }
}

@Preview
@Composable
fun TopBarPreview() {
    TopBar(title = "Timesheet", onProfileClicked = {})
}