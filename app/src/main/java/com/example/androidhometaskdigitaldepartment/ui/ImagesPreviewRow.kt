package com.example.androidhometaskdigitaldepartment.ui

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidhometaskdigitaldepartment.R


@Preview
@Composable
fun ImagePreviewRow(){
    ImageRow(imageList = listOf(
            R.drawable.img_4,
        R.drawable.img_3,
    ),
    contentPadding = PaddingValues(start = 24.dp, end = 24.dp))
}

@Composable
fun ImageRow(
    imageList: List<Int>,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.padding(contentPadding).horizontalScroll(rememberScrollState()),
    ) {
        imageList.forEach { imageRes ->
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .padding(4.dp).width(200.dp).height(120.dp).clip(RoundedCornerShape(10.dp))
            )
        }
    }
}