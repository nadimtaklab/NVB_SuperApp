package com.nvb_superapp.presentation.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wealth.presentation.screen.WealthHomeScreen
import com.nvb_superapp.presentation.screens.home.HomeScreen

@Composable
fun AppNavGraph(){

    val navController = rememberNavController()

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController, startDestination = Screen.HomeScreen.route) {
            composable(route = Screen.HomeScreen.route){
                HomeScreen(
                    primaryButtonClicked = {

                    },
                    wealthBannerClicked = {
                        navController.navigate(Screen.WealthScreen.route)
                    }
                )
            }

            composable( route = Screen.WealthScreen.route){
                WealthHomeScreen(
                    primaryButtonClicked = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }

}