package com.example.timetracker.presentation.timesheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.timetracker.R
import com.example.timetracker.presentation.timesheet.nav.TimesheetDestination
import com.example.timetracker.presentation.ui.theme.CodGray
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Shapes
import com.example.timetracker.presentation.ui.theme.TextSizes
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
            .background(CodGray)
    ) {
        item {
            Text(
                text = "Time so far:",
                color = White,
                 textAlign = TextAlign.Center,
                fontSize = TextSizes.SIZE_22
            )
        }
        item {
            Text(
                text = "142 out of 144",
                color = White,
                textAlign = TextAlign.Center,
                fontSize = TextSizes.SIZE_22
            )
        }
        item {
            Text(
                text = "You are expected to track an avg of 8 hours per day.",
                color = White,
                textAlign = TextAlign.Center,
                fontSize = TextSizes.SIZE_22
            )
        }
        item {
            Card(
            ) {

            }
        }
        item {
            Text(
                text = "Missing hours for Wed 04, Thu 05",
                color = White,
                textAlign = TextAlign.Center,
                fontSize = TextSizes.SIZE_22
            )
        }
        item {
            Button(modifier = Modifier
                .fillMaxWidth()
                .height(Dimens.DIMEN_56),
                colors = ButtonDefaults.buttonColors(
                    containerColor = VioletRed,
                ),
                shape = Shapes.large,
                onClick = {
                    navController.navigate(TimesheetDestination.route)
                }
            ) {
                Text(
                    modifier = Modifier.background(
                        color = Color.Transparent, shape = Shapes.large
                    ),
                    text = stringResource(id = R.string.sign_in),
                    color = White,
                    style = TextStyle(
                        fontFamily = fonts,
                        fontWeight = FontWeight.Bold,
                        fontSize = TextSizes.SIZE_14
                    )
                )
            }
        }
        items() {}

    }
}