package com.example.timetracker.presentation.forgotPassword.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.timetracker.presentation.common.navigation.NavigationDestination
import com.example.timetracker.presentation.forgotPassword.ForgotPasswordScreen
import com.example.timetracker.presentation.login.LoginScreen
import com.example.timetracker.presentation.resetPassword.ResetPasswordScreen

object ForgotPasswordDestination : NavigationDestination {
    override val route: String = "forgot_password"
}

fun NavGraphBuilder.forgotPasswordGraph(
    navController: NavController,
    setBottomNavBarVisibility: (Boolean) -> Unit
) {
    composable(route = ForgotPasswordDestination.route) {
        setBottomNavBarVisibility(false)
        ForgotPasswordScreen(navController)
    }
}