package com.example.timetracker.presentation.holiday.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.timetracker.presentation.common.navigation.NavigationDestination
import com.example.timetracker.presentation.holiday.HolidayScreen

object HolidayDestination : NavigationDestination {
    override val route: String = "holiday"
}

fun NavGraphBuilder.holidayGraph(
    navController: NavController, setBottomNavBarVisibility: (Boolean) -> Unit
) {
    composable(route = HolidayDestination.route) {
        setBottomNavBarVisibility(true)
        HolidayScreen(navController)
    }
}