package com.example.timetracker.presentation.timesheet.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.timetracker.presentation.common.navigation.NavigationDestination
import com.example.timetracker.presentation.timesheet.TimesheetScreen

object TimesheetDestination : NavigationDestination {
    override val route: String = "timesheet"
}

fun NavGraphBuilder.timesheetGraph(
    navController: NavController, setBottomNavBarVisibility: (Boolean) -> Unit
) {
    composable(route = TimesheetDestination.route) {
        setBottomNavBarVisibility(true)
        TimesheetScreen(navController)
    }
}