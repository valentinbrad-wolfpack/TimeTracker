package com.example.timetracker.presentation.login.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.timetracker.presentation.common.navigation.NavigationDestination
import com.example.timetracker.presentation.login.LoginScreen

object LoginDestination : NavigationDestination {
    override val route: String = "login"
}

fun NavGraphBuilder.loginGraph(
    navController: NavController,
    setBottomNavBarVisibility: (Boolean) -> Unit
) {
    composable(route = LoginDestination.route) {
        setBottomNavBarVisibility(false)
        LoginScreen(navController)
    }
}