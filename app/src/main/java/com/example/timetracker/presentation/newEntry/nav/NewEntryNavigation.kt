package com.example.timetracker.presentation.newEntry.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.timetracker.presentation.common.navigation.NavigationDestination
import com.example.timetracker.presentation.newEntry.NewEntryScreen

object NewEntryDestination : NavigationDestination {
    override val route: String = "new_entry"
}

fun NavGraphBuilder.newEntryGraph(
    navController: NavController, setBottomNavBarVisibility: (Boolean) -> Unit
) {
    composable(route = NewEntryDestination.route) {
        setBottomNavBarVisibility(false)
        NewEntryScreen(navController)
    }
}