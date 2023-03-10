package com.example.timetracker.presentation.holiday

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.timetracker.R
import com.example.timetracker.presentation.common.components.TopBar
import com.example.timetracker.presentation.holiday.components.HolidayDetailsSection
import com.example.timetracker.presentation.holiday.components.HolidayListItem
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.TimeTrackerTheme

@Composable
fun HolidayScreen(
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            TopBar(title = stringResource(id = R.string.holiday_label), onProfileClicked = {})
            Spacer(modifier = Modifier.height(Dimens.DIMEN_16))
            HolidayDetailsSection()
            Spacer(modifier = Modifier.height(Dimens.DIMEN_24))
        }
        items(listOf(1, 2, 3)) { entries ->
            HolidayListItem()
        }
    }
}

@Preview
@Composable
fun HolidayScreenPreview() {
    TimeTrackerTheme {
        val navController = rememberNavController()
        HolidayScreen(navController)
    }
}