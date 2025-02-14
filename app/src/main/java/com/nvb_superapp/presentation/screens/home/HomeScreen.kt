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
import androidx.compose.ui.tooling.preview.Preview
import com.nvb_superapp.presentation.components.AppToolbar
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
                .wrapContentSize(Alignment.Center)
                .background(white)
                .padding(innerPadding)
        ){

        }

    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}