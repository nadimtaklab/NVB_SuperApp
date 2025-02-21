package com.example.design.components




import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextComponent(
    modifier: Modifier,
    textValue: String?=null,
    textColorValue: Color = com.example.design.ui.theme.black,
    fontSizeValue: TextUnit = 16.sp,
    paddingValue: Dp = 0.dp
){
    textValue?.let{
        Text(
            modifier = modifier,
            text = it,
            style = TextStyle(
                color = textColorValue,
                fontSize = fontSizeValue
            ),
            textAlign = TextAlign.Center
        )
    }

}