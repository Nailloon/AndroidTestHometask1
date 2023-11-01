package com.example.androidhometaskdigitaldepartment.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidhometaskdigitaldepartment.R
import com.example.androidhometaskdigitaldepartment.ui.theme.AppTheme
@Composable
fun DotaHeader(modifier:Modifier=Modifier ){
    HeaderBackground(
        painter = painterResource(id = R.drawable.img),
        modifier = modifier.fillMaxSize()
    ){}
    Row(modifier = Modifier.fillMaxWidth().offset(24.dp, -20.dp)) {
        DotaIcon(
            painter = painterResource(id = R.drawable.img_1),
            modifier = Modifier.size(85.dp).border(2.dp, Color.LightGray, RoundedCornerShape(10.dp)).clip(shape = RoundedCornerShape(size = 10.dp))
                .background(Color.Black)
        ){}
    }
}
@Composable
fun DotaIcon(painter: Painter,modifier:Modifier=Modifier, content: @Composable ()-> Unit){
    Box(modifier = modifier, contentAlignment = Alignment.Center){
        Image(painter = painter,
            contentDescription = "Иконка Dota2",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(65.dp))
    }
}

@Composable
private fun HeaderBackground(painter: Painter,modifier:Modifier=Modifier,content: @Composable ()-> Unit){
    Box(modifier = modifier, contentAlignment = Alignment.TopCenter){
        Image(painter = painter, contentDescription = "Картинка с героями игры Dota 2", contentScale = ContentScale.Crop, modifier = Modifier.fillMaxWidth().fillMaxHeight(0.3f))
    }
}
@Preview
@Composable
fun DotaScreenHeaderPreview(){
    Surface(color = AppTheme.BgColors.greyBackground){
        DotaHeader()
    }
}