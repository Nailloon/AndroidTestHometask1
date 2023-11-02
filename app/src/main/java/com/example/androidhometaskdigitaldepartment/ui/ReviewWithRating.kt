package com.example.androidhometaskdigitaldepartment.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androidhometaskdigitaldepartment.R
import com.example.androidhometaskdigitaldepartment.ui.theme.AppTheme

@Composable
fun ReviewWithRating(float: Float,modifier: Modifier){
    Row(modifier = modifier) {
        Text(text = float.toString(), style= AppTheme.TextStyle.Regular_48, color = AppTheme.TextColors.whiteText)
        Column(modifier = Modifier.padding(top=13.dp, start = 16.dp)){
            StarRating(rating = float, modifier = Modifier.height(16.dp))
            Text(text = "70M Reviews", style = AppTheme.TextStyle.Regular_12_05_400, color = AppTheme.TextColors.greyText, modifier = Modifier.padding(top = 8.dp, bottom = 7.dp))
        }
    }
}
@Composable
fun StarRating(rating: Float, modifier: Modifier) {
    val fullStarCount = rating.toInt()
    val halfStarCount = if (rating - fullStarCount >= 0.5f) 1 else 0
    val emptyStarCount = 5 - fullStarCount - halfStarCount

    Row {
        repeat(fullStarCount) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = null,
                tint = Color.Yellow,
                modifier = modifier
            )
        }
        if (halfStarCount > 0) {
            HalfFilledIcon(modifier=modifier)
        }
        repeat(emptyStarCount) {
            UnFilledIcon(modifier = modifier)
        }
    }
}

@Composable
fun HalfFilledIcon(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.baseline_star_half_24 ),
        contentDescription = null,
        modifier = modifier
    )
}
@Composable
fun UnFilledIcon(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.baseline_star_outline_24),
        contentDescription = null,
        modifier = modifier
    )
}