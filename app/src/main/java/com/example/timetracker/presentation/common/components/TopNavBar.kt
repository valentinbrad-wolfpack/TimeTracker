package com.example.timetracker.presentation.common.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.example.timetracker.R

@Composable
fun TopNavBar(
    modifier: Modifier = Modifier,
    title: String? = null,
    onBackClicked: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Transparent)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_arrow_left),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .clickable { onBackClicked.invoke() }
        )
        title?.let {
            Text(
                text = title,
                color = MaterialTheme.colors.onPrimary,
                style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Start,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
