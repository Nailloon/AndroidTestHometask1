package com.example.androidhometaskdigitaldepartment.ui

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.androidhometaskdigitaldepartment.R
import com.example.androidhometaskdigitaldepartment.ui.theme.AppTheme

@Composable
fun DotaScreen(){
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
        item{
            RoundedInstallButton(modifier = Modifier.fillMaxWidth().padding(start = 24.dp, end = 24.dp)){ Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show()}
        }
    }
}