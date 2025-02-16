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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import coil3.imageLoader
import coil3.util.DebugLogger
import com.nvb_superapp.R
import com.nvb_superapp.presentation.components.AppToolbar
import com.nvb_superapp.presentation.components.BannerComponent
import com.nvb_superapp.presentation.ui.theme.white

@Composable
fun HomeScreen(){

    Scaffold(
        topBar = {
            AppToolbar()
        }
    )
    { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .background(white)
                .padding(innerPadding)
        ){
            BannerComponent(
                title = stringResource(R.string.wealth),
                description= stringResource(R.string.invest_your_idea),
                imageUrl = null,
                resourceValue = R.drawable.ic_wealth
            )
        }

    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}