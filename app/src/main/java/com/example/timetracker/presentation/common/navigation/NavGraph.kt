package com.example.timetracker.presentation.common.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.timetracker.presentation.forgotPassword.nav.forgotPasswordGraph
import com.example.timetracker.presentation.holiday.nav.holidayGraph
import com.example.timetracker.presentation.login.nav.LoginDestination
import com.example.timetracker.presentation.login.nav.loginGraph
import com.example.timetracker.presentation.newEntry.nav.newEntryGraph
import com.example.timetracker.presentation.resetPassword.nav.resetPasswordGraph
import com.example.timetracker.presentation.timesheet.nav.timesheetGraph

@Composable
fun NavHostGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    setBottomNavBarVisibility: (Boolean) -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = LoginDestination.route,
        modifier = modifier
    ) {
        loginGraph(
            navController = navController,
            setBottomNavBarVisibility = setBottomNavBarVisibility
        )
        forgotPasswordGraph(
            navController = navController,
            setBottomNavBarVisibility = setBottomNavBarVisibility
        )
        resetPasswordGraph(
            navController = navController,
            setBottomNavBarVisibility = setBottomNavBarVisibility
        )
        timesheetGraph(
            navController = navController,
            setBottomNavBarVisibility = setBottomNavBarVisibility
        )
        holidayGraph(
            navController = navController,
            setBottomNavBarVisibility = setBottomNavBarVisibility
        )
        newEntryGraph(
            navController = navController,
            setBottomNavBarVisibility = setBottomNavBarVisibility
        )
    }
}
