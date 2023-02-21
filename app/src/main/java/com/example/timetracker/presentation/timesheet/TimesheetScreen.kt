package com.example.timetracker.presentation.timesheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.timetracker.R
import com.example.timetracker.presentation.timesheet.components.EntryListItem
import com.example.timetracker.presentation.timesheet.nav.TimesheetDestination
import com.example.timetracker.presentation.ui.theme.CodGray
import com.example.timetracker.presentation.ui.theme.DarkGray
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Gray
import com.example.timetracker.presentation.ui.theme.Paddings
import com.example.timetracker.presentation.ui.theme.Shapes
import com.example.timetracker.presentation.ui.theme.TextSizes
import com.example.timetracker.presentation.ui.theme.TimeTrackerTheme
import com.example.timetracker.presentation.ui.theme.VioletRed
import com.example.timetracker.presentation.ui.theme.White
import com.example.timetracker.presentation.ui.theme.fonts

@Composable
fun TimesheetScreen(
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(CodGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.bg_timesheet),
                contentDescription = null,
                modifier = Modifier
                    .wrapContentSize()
                    .padding(horizontal = Paddings.PADDING_40),
            )
            Text(
                modifier = Modifier.padding(horizontal = Paddings.PADDING_40),
                text = stringResource(id = R.string.time_so_far),
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.Normal,
                    fontSize = TextSizes.SIZE_12,
                    textAlign = TextAlign.Center,
                    color = Gray
                )
            )
            Text(
                modifier = Modifier.padding(horizontal = Paddings.PADDING_40),
                text = stringResource(id = R.string.tracked_time, 100, 108),
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.Bold,
                    fontSize = TextSizes.SIZE_32,
                    textAlign = TextAlign.Center,
                    color = White
                )
            )
            Text(
                modifier = Modifier.padding(horizontal = Paddings.PADDING_40),
                text = stringResource(id = R.string.expected_hours_per_day, 8),
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.Normal,
                    fontSize = TextSizes.SIZE_12,
                    textAlign = TextAlign.Center,
                    color = Gray
                )
            )
            Spacer(modifier = Modifier.height(Dimens.DIMEN_24))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = Paddings.PADDING_32),
                shape = Shapes.large,
                colors = CardDefaults.cardColors(
                    containerColor = DarkGray
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = Paddings.PADDING_12),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        modifier = Modifier.padding(start = Paddings.PADDING_32),
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
                            style = TextStyle(
                                fontFamily = fonts,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = TextSizes.SIZE_16,
                                color = White
                            )
                        )
                    }
                    Image(
                        modifier = Modifier.padding(end = Paddings.PADDING_32),
                        painter = painterResource(id = R.drawable.ic_arrow_right),
                        contentDescription = null
                    )
                }
            }
            Spacer(modifier = Modifier.height(Dimens.DIMEN_20))
            Text(
                modifier = Modifier.padding(horizontal = Paddings.PADDING_40),
                text = stringResource(id = R.string.missing_hours_for, "Wed 04"),
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.Bold,
                    fontSize = TextSizes.SIZE_14,
                    textAlign = TextAlign.Center,
                    color = VioletRed
                )
            )
            Button(modifier = Modifier
                .fillMaxWidth()
                .height(Dimens.DIMEN_56)
                .padding(horizontal = Paddings.PADDING_40),
                colors = ButtonDefaults.buttonColors(
                    containerColor = VioletRed,
                ),
                shape = Shapes.large,
                onClick = {
                    navController.navigate(TimesheetDestination.route)
                }) {
                Text(
                    modifier = Modifier.background(
                        color = Color.Transparent, shape = Shapes.large
                    ),
                    text = stringResource(id = R.string.add_now),
                    color = White,
                    style = TextStyle(
                        fontFamily = fonts,
                        fontWeight = FontWeight.Bold,
                        fontSize = TextSizes.SIZE_14
                    )
                )
            }
            Spacer(modifier = Modifier.height(Dimens.DIMEN_20))
        }
        items(listOf(1, 2, 3)) { entries ->
            EntryListItem()
        }
    }
}

@Preview
@Composable
fun TimesheetScreenPreview() {
    TimeTrackerTheme {
        val navController = rememberNavController()
        TimesheetScreen(navController)
    }
}