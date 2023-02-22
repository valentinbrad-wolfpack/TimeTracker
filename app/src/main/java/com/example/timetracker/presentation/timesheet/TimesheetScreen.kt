package com.example.timetracker.presentation.timesheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.timetracker.R
import com.example.timetracker.presentation.common.components.TopBar
import com.example.timetracker.presentation.timesheet.components.EntryListItem
import com.example.timetracker.presentation.timesheet.components.MissingHoursSection
import com.example.timetracker.presentation.timesheet.components.MonthPicker
import com.example.timetracker.presentation.timesheet.components.TimesheetDetailsSection
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.TimeTrackerTheme

@Composable
fun TimesheetScreen(
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            TopBar(title = stringResource(id = R.string.timesheet_label), onProfileClicked = {})
            Spacer(modifier = Modifier.height(Dimens.DIMEN_16))
            TimesheetDetailsSection()
            Spacer(modifier = Modifier.height(Dimens.DIMEN_24))
            MonthPicker()
            Spacer(modifier = Modifier.height(Dimens.DIMEN_20))
            MissingHoursSection()
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