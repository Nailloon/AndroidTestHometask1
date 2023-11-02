package com.example.androidhometaskdigitaldepartment.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
    ){
            DotaIcon(
                painter = painterResource(id = R.drawable.img_1),
                modifier = Modifier
                    .padding(top = 300.dp)
                    .offset(24.dp, -20.dp)
                    .width(88.dp)
                    .height(95.dp)
                    .border(2.dp, AppTheme.BgColors.border, RoundedCornerShape(10.dp))
                    .clip(shape = RoundedCornerShape(size = 10.dp))
                    .background(Color.Black)
            ) {Column(modifier = Modifier.offset(124.dp, 300.dp).padding(top = 14.dp)){Text(text="DoTA 2", style = AppTheme.TextStyle.Bold_20_26,
                color = AppTheme.TextColors.whiteText)
                Row(modifier = Modifier.padding(top = 7.dp).height(14.dp)){
                    Stars(painterResource(id = R.drawable.img_stars), modifier = Modifier.size(76.dp,12.dp)){}
                    Text(text="70M",modifier = Modifier.padding(start=10.dp).height(14.dp), style = AppTheme.TextStyle.Regular_12_05, color = AppTheme.TextColors.downloadsText)
                }
            }}}

}
@Composable
fun Stars(painter: Painter,modifier:Modifier=Modifier, content: @Composable ()-> Unit){
    Image(painter = painter,
        contentDescription = "Рейтинг игры DoTA 2, пять звезд",
        modifier = modifier
    )
    content()
}
@Composable
fun DotaIcon(painter: Painter,modifier:Modifier=Modifier, content: @Composable ()-> Unit){
    Box(modifier = modifier, contentAlignment = Alignment.Center){
        Image(painter = painter,
            contentDescription = "Иконка Dota2",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(54.dp)
                .height(54.dp))
    }
    content()
}

@Composable
private fun HeaderBackground(painter: Painter,modifier:Modifier=Modifier,content: @Composable ()-> Unit){
    Box(modifier = modifier){
        Image(painter = painter, contentDescription = "Картинка с героями игры Dota 2", contentScale = ContentScale.FillBounds, modifier = Modifier
            .width(628.dp)
            .height(294.dp), )
        content()
    }
}
@Preview
@Composable
fun DotaScreenHeaderPreview(){
    Surface(color = AppTheme.BgColors.greyBackground){
        DotaHeader()
    }
}