package com.example.androidhometaskdigitaldepartment.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidhometaskdigitaldepartment.ui.theme.AppTheme

@Composable
fun ScrolableChipsRow(modifier: Modifier, contentPadding: PaddingValues, chips: List<ContentChip>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier,
    ) {
        items(chips) { item ->
            Chip(
                text = item,
                backgroundColor = AppTheme.BgColors.chipBackgroundColor,
            )
        }
    }
}

@Composable
fun Chip(text: ContentChip, backgroundColor: Color) {
    Box(
        modifier = Modifier
            .height(22.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text.textOfChip,
            style = AppTheme.TextStyle.Regular_10_500,
            color = AppTheme.TextColors.chipTextColor,
            modifier = Modifier.padding(horizontal = 10.dp)
        )
    }
}

@Preview
@Composable
fun PreviewScrolableChipsRow() {
    ScrolableChipsRow(chips = chipList, contentPadding = PaddingValues(), modifier = Modifier)
}
