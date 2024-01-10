package com.example.androidhometaskdigitaldepartment.ui

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidhometaskdigitaldepartment.R
import com.example.androidhometaskdigitaldepartment.ui.theme.AppTheme


@Preview
@Composable
fun ImagePreviewRow() {
    ImageRow(
        imageList = listOf(
            R.drawable.img_4,
            R.drawable.img_3,
        ),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
    )
}

@Composable
fun ImageRow(
    imageList: List<Int>,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(contentPadding)
            .horizontalScroll(rememberScrollState()),
    ) {
        imageList.forEach { imageRes ->
            Box(
                modifier = Modifier
                    .padding(4.dp)
                    .width(200.dp)
                    .height(120.dp)
                    .clip(RoundedCornerShape(10.dp))

            ) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier

                )
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .align(Alignment.Center)
                        .size(48.dp)
                        .background(AppTheme.BgColors.third)
                        .blur(1.5.dp)
                        .border(
                            width = 0.7.dp,
                            color = AppTheme.BgColors.circuit,
                            shape = CircleShape
                        )
                ) {
                    Image(
                        painter = painterResource(R.drawable.right_arrow),
                        contentDescription = "play",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .width(24.dp)
                            .height(24.dp)
                    )
                }
            }


        }
    }
}