package com.example.jetpackcomposelearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HelloWorld(name:String){
    TextComponent(value = "Hello $name",
        size = 24.sp,
        colorValue = Color.Magenta)

}

//@Preview(showBackground = true)
@Composable
fun HelloWorldPreviewForComponent(nameVale:String= "Sudhanshu"){
    HelloWorld(name = nameVale)

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloWorldPreviewInMobileScreen(nameVale:String= "Sudhanshu"){
    HelloWorld(name = nameVale)

}

@Composable
fun TextComponent(value: String,
                  size: TextUnit= 18.sp,
                  colorValue: Color= Color.Magenta,
                  fontWeightValue: FontWeight = FontWeight.Normal,
                  fontStyleValue: FontStyle = FontStyle.Normal,
                  maxLineValue:Int?=null, backgroundColor: Color = Color.White
) {
    Text(modifier= Modifier
        //.wrapContentWidth()
        //.fillMaxSize()
        .fillMaxWidth()
        .wrapContentHeight(align = Alignment.Top)
        .background(backgroundColor)
        //.clip(shape = RoundedCornerShape(20.dp))
        //.border(2.dp, Color.Magenta)
        .padding(18.dp),
        text = value,
        fontSize = size,
        color = colorValue,
        fontWeight =fontWeightValue,
        fontStyle = fontStyleValue,
        maxLines = maxLineValue?: Int.MAX_VALUE,
        overflow = TextOverflow.Ellipsis)



}

@Preview
@Composable
fun TextComponentPreview(){
    TextComponent(value = "Hello Sudhanshu",
        size = 18.sp,
        colorValue = Color.Magenta, maxLineValue = 5)
}

@Composable
fun SimpleButton(){
    Button(onClick = { /*TODO*/ }) {
        
    }

}


