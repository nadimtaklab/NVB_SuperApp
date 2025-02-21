package com.example.design.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.R

@Composable
fun AppToolbar(
    title:String?=null,
    isBackButtonVisible:Boolean=false,
    isNotificationButtonVisible:Boolean=false,
    primaryButtonClicked : () -> Unit = {}
){
    Row(
       modifier = Modifier
           .background(com.example.design.ui.theme.PrimaryColor)
           .systemBarsPadding()
           .fillMaxWidth()
           .wrapContentHeight()
           .padding(top=8.dp,start=18.dp,end=18.dp),
        verticalAlignment = Alignment.CenterVertically
    ){

        if(isBackButtonVisible){
            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        primaryButtonClicked()
                    },
                painter = painterResource( id= R.drawable.baseline_arrow_back_24),
                contentDescription = "Back Button",
                tint = Color.White
            )
        } else {
            Icon(
                modifier = Modifier.size(40.dp),
                painter = painterResource(id= R.drawable.baseline_density_medium_24),
                contentDescription = "User Image",
                tint = Color.White
            )
        }


        Spacer(modifier = Modifier.width(18.dp))

        TextComponent(
            modifier = Modifier.wrapContentSize(),
            textValue = title,
            textColorValue = com.example.design.ui.theme.white,
            fontSizeValue = 20.sp,
            paddingValue = 8.dp
        )

        Spacer(modifier = Modifier.weight(1f))

        if(isNotificationButtonVisible) {
            Icon(
                modifier = Modifier.size(40.dp),
                painter = painterResource(id = R.drawable.baseline_circle_notifications_24),
                contentDescription = "User Notification",
                tint = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppToolbarPreview(){
    AppToolbar(
        title = "AppToolBar",
        isBackButtonVisible = true
    )
}