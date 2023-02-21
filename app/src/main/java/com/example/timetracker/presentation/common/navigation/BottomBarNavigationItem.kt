package com.example.timetracker.presentation.common.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.timetracker.R
import com.example.timetracker.presentation.holiday.nav.HolidayDestination
import com.example.timetracker.presentation.timesheet.nav.TimesheetDestination

sealed class BottomBarNavigationItem(
    val destination: NavigationDestination?,
    @StringRes val title: Int?,
    @DrawableRes val icon: Int?
)

object TimesheetBottomBarNavigationItem : BottomBarNavigationItem(
    destination = TimesheetDestination,
    title = R.string.timesheet_label,
    icon = R.drawable.ic_calendar_fill
)

object NewEntryBottomBarNavigationItem : BottomBarNavigationItem(
    destination = null,
    title = R.string.new_entry_label,
    icon = null
)

object HolidayBottomBarNavigationItem : BottomBarNavigationItem(
    destination = HolidayDestination,
    title = R.string.holiday_label,
    icon = R.drawable.ic_holiday_fill
)