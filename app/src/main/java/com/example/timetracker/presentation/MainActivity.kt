package com.example.timetracker.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.FloatingActionButtonElevation
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.timetracker.R
import com.example.timetracker.presentation.common.components.BottomNavBar
import com.example.timetracker.presentation.common.navigation.HolidayBottomBarNavigationItem
import com.example.timetracker.presentation.common.navigation.NavHostGraph
import com.example.timetracker.presentation.common.navigation.NewEntryBottomBarNavigationItem
import com.example.timetracker.presentation.common.navigation.TimesheetBottomBarNavigationItem
import com.example.timetracker.presentation.newEntry.nav.NewEntryDestination
import com.example.timetracker.presentation.ui.theme.CodGray
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Elevations
import com.example.timetracker.presentation.ui.theme.TextSizes
import com.example.timetracker.presentation.ui.theme.TimeTrackerTheme
import com.example.timetracker.presentation.ui.theme.VioletRed
import com.example.timetracker.presentation.ui.theme.White
import com.example.timetracker.presentation.ui.theme.fonts
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            TimeTrackerTheme {
                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                var bottomNavBarVisibility by remember { mutableStateOf(false) }

                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    bottomBar = {
                        BottomNavBar(
                            items = setOf(
                                TimesheetBottomBarNavigationItem,
                                NewEntryBottomBarNavigationItem,
                                HolidayBottomBarNavigationItem
                            ),
                            navController = navController,
                            currentDestination = navBackStackEntry?.destination,
                            isVisible = bottomNavBarVisibility
                        )
                    },
                    floatingActionButton = {
                        if (bottomNavBarVisibility)
                            FloatingActionButton(
                                modifier = Modifier.size(Dimens.DIMEN_70),
                                backgroundColor = VioletRed,
                                elevation = FloatingActionButtonDefaults.elevation(Elevations.ELEVATION_8),
                                onClick = {
                                    navController.navigate(route = NewEntryDestination.route)
                                }) {
                                Icon(
                                    modifier = Modifier.size(Dimens.DIMEN_32),
                                    imageVector = Icons.Default.Add,
                                    tint = White,
                                    contentDescription = null
                                )
                            }
                    },
                    floatingActionButtonPosition = FabPosition.Center,
                    isFloatingActionButtonDocked = true,
                    backgroundColor = CodGray,
                    scaffoldState = scaffoldState
                ) { paddingValues ->
                    NavHostGraph(
                        navController = navController,
                        modifier = Modifier.padding(bottom = paddingValues.calculateBottomPadding()),
                        setBottomNavBarVisibility = { isVisible ->
                            bottomNavBarVisibility = isVisible
                        }
                    )
                }
            }
        }
    }
}
