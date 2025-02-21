package com.nvb_superapp.presentation.screens.home

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
import com.nvb_superapp.R
import com.example.design.components.AppToolbar
import com.example.design.components.BannerComponent

@Composable
fun HomeScreen(
    primaryButtonClicked : () -> Unit = {},
    wealthBannerClicked : () -> Unit = {}
){

    Scaffold(
        topBar = {
            AppToolbar(
                title = stringResource(R.string.add_address),
                isNotificationButtonVisible = true,
                primaryButtonClicked = {
                    primaryButtonClicked()
                }
            )
        }
    )
    { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .background(com.example.design.ui.theme.white)
                .padding(innerPadding)
        ){
            BannerComponent(
                title = stringResource(R.string.wealth),
                description= stringResource(R.string.invest_your_idea),
                imageUrl = null,
                resourceValue = R.drawable.ic_wealth,
                bannerClicked = {
                    wealthBannerClicked()
                }
            )
        }

    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}