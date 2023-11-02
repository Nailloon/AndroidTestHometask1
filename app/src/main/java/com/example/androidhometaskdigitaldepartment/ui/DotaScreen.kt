package com.example.androidhometaskdigitaldepartment.ui

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.androidhometaskdigitaldepartment.R
import com.example.androidhometaskdigitaldepartment.ui.theme.AppTheme

@Composable
fun DotaScreen(comments: List<Comment>){
    val context = LocalContext.current
    val lazyListState = rememberLazyListState()
    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize(),
    ){
        item{
            DotaHeader()
        };
        item{
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = AppTheme.TextStyle.Regular_12_19,
                color = AppTheme.TextColors.greyText,
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 20.dp,
                        bottom = 12.dp,
                    )
                    .alpha(0.7f)
            )
        };
        item{
            ImageRow(imageList = listOf(
                R.drawable.img_5,
                R.drawable.img_6,
                R.drawable.img_4,
                R.drawable.img_3,
            ),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )
        };
        item {
            Text(text = "Review & Ratings", style = AppTheme.TextStyle.Regular_16, color = AppTheme.TextColors.greyText, modifier = Modifier.padding(start = 24.dp, end = 24.dp, top=20.dp, bottom = 12.dp))
        };
        item{
            ReviewWithRating(float = 4.9F, modifier = Modifier.height(58.dp).padding(start = 24.dp))
        };
        itemsIndexed(comments) {index, item ->
            CommentBlock(item,modifier=Modifier.padding(start = 24.dp, top = 16.dp, end=24.dp))
            if (index <comments.lastIndex){
                Divider(color = AppTheme.BgColors.divider, thickness = 1.dp, modifier = Modifier.padding(top = 12.dp, bottom = 10.dp))
            }
        }
        item {
            Spacer(modifier = Modifier.height(40.dp))
        };
        item{
            RoundedInstallButton(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)){ Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show()}
        };
        item {
            Spacer(modifier = Modifier.height(38.dp))
        };
    }
}
