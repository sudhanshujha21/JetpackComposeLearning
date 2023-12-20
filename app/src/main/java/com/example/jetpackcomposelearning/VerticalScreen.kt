package com.example.jetpackcomposelearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun VerticalScreen(){

    Column(modifier = Modifier
        .background(Color.Black)
        .padding(18.dp)
        .fillMaxWidth()
        .wrapContentHeight(),
        verticalArrangement = Arrangement.Center ) {
        TextComponent(value = "Text1")
        TextComponent(value = "Text2")
        TextComponent(value = "Text3")
        TextComponent(value = "Text4")
    }
}

@Composable
@Preview
fun VerticalScreenPreview(){
    VerticalScreen()
}

