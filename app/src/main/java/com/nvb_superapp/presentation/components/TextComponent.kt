package com.nvb_superapp.presentation.components




import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.nvb_superapp.presentation.ui.theme.black

@Composable
fun TextComponent(
    modifier: Modifier,
    textValue: String,
    textColorValue: Color = black,
    fontSizeValue: TextUnit = 16.sp
){
    Text(
        modifier = modifier,
        text = textValue,
        style = TextStyle(
            color = textColorValue,
            fontSize = fontSizeValue
        ),
        textAlign = TextAlign.Center
    )

}