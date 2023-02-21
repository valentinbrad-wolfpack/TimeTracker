package com.example.timetracker.presentation.common.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.timetracker.presentation.common.navigation.BottomBarNavigationItem
import com.example.timetracker.presentation.ui.theme.CodGray
import com.example.timetracker.presentation.ui.theme.DarkGray
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Elevations
import com.example.timetracker.presentation.ui.theme.Shapes
import com.example.timetracker.presentation.ui.theme.TextSizes
import com.example.timetracker.presentation.ui.theme.TopShapes
import com.example.timetracker.presentation.ui.theme.VioletRed
import com.example.timetracker.presentation.ui.theme.fonts

@Composable
fun BottomNavBar(
    items: Set<BottomBarNavigationItem>,
    navController: NavHostController,
    currentDestination: NavDestination?,
    isVisible: Boolean
) {
    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically { it },
        exit = slideOutVertically { it }
    ) {
        BottomNavigation(
            backgroundColor = MaterialTheme.colorScheme.surface,
            elevation = Elevations.ELEVATION_8,
            modifier = Modifier
                .height(Dimens.DIMEN_70)
                .graphicsLayer {
                    shape = TopShapes.large
                    clip = true
                }
                .border(
                    width = Dimens.DIMEN_1, shape = TopShapes.large, color = DarkGray
                )
        ) {
            items.forEach { screen ->
                val isSelected = screen.destination?.route == currentDestination?.route
                BottomNavigationItem(
                    selected = isSelected,
                    icon = {
                        screen.icon?.let {
                            Icon(
                                painterResource(id = screen.icon),
                                contentDescription = null
                            )
                        }
                    },
                    label = {
                        screen.title?.let {
                            Text(
                                text = stringResource(id = screen.title),
                                style = TextStyle(
                                    fontFamily = fonts,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = TextSizes.SIZE_10
                                )
                            )
                        }
                    },
                    selectedContentColor = Color.White,
                    unselectedContentColor = screen.icon?.let { Color.Gray } ?: Color.White,
                    enabled = screen.destination?.let { true } ?: false,
                    onClick = {
                        screen.destination?.route?.let { route ->
                            navController.navigate(
                                route = route,
                                builder = {
                                    popUpTo(navController.graph.findStartDestination().id)
                                    launchSingleTop = true
                                }
                            )
                        }
                    }
                )
            }
        }
    }
}