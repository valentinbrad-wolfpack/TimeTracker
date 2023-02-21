package com.example.timetracker.presentation.resetPassword.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.timetracker.presentation.common.navigation.NavigationDestination
import com.example.timetracker.presentation.resetPassword.ResetPasswordScreen


object ResetPasswordDestination : NavigationDestination {
    override val route: String = "reset_password"
}

fun NavGraphBuilder.resetPasswordGraph(
    navController: NavController,
    setBottomNavBarVisibility: (Boolean) -> Unit
) {
    composable(route = ResetPasswordDestination.route) {
        setBottomNavBarVisibility(false)
        ResetPasswordScreen(navController)
    }
}