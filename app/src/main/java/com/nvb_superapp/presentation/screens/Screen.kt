package com.nvb_superapp.presentation.screens

sealed class Screen(val route:String) {

    data object HomeScreen : Screen(route = "home_screen")
}