package com.example.wealth.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.design.components.AppToolbar
import com.example.wealth.R

@Composable
fun WealthHomeScreen(
    primaryButtonClicked : () -> Unit = {}
) {
    Scaffold(
        topBar = {
            AppToolbar(
                title = stringResource(R.string.wealth),
                isBackButtonVisible = true,
                primaryButtonClicked = {
                    primaryButtonClicked()
                }
            )
        }
    )
    {
        innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .background(com.example.design.ui.theme.white)
                .padding(innerPadding)
        ){

        }
    }
}

@Preview
@Composable
fun WealthHomeScreenPreview() {
    WealthHomeScreen()
}