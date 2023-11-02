package com.example.androidhometaskdigitaldepartment.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidhometaskdigitaldepartment.ui.theme.AppTheme

@Composable
fun CommentBlock(
    comment: Comment,
    modifier: Modifier,
){
    Column(modifier = modifier){
        Row(){
            Box(modifier = Modifier
                .clip(CircleShape)
                .size(36.dp)){
                Image(painter = painterResource(id = comment.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop)
            }
            Column(modifier = Modifier.padding(start = 16.dp)){
                Text(text = comment.username, style= AppTheme.TextStyle.Regular_16, color=AppTheme.TextColors.whiteText);
                Text(text = comment.date,style= AppTheme.TextStyle.Regular_12_05, color=AppTheme.TextColors.dateText, modifier = Modifier.padding(top = 7.dp))
            }
        }
    }
    Text(comment.text, modifier = Modifier.padding(start = 24.dp, end = 24.dp), style= AppTheme.TextStyle.Regular_12_20, color = AppTheme.TextColors.commentText)
}
