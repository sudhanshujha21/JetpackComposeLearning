package com.example.jetpackcomposelearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun horizontalScreen(){

    Row (modifier =
    Modifier.fillMaxWidth()
        .height(400.dp)
        .background(Color.Black)
        ,horizontalArrangement = Arrangement.SpaceEvenly
    ,verticalAlignment = Alignment.CenterVertically){

        TextComponent(value = "Text1")
        TextComponent(value = "Text2")
        TextComponent(value = "Text3")
        TextComponent(value = "Text4")

    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun horizontalScreenComponent(){
    horizontalScreen()
}

