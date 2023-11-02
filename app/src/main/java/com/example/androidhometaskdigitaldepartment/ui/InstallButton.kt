package com.example.androidhometaskdigitaldepartment.ui

import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androidhometaskdigitaldepartment.ui.theme.AppTheme

@Composable
fun RoundedInstallButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    Button(
        onClick = onClick,
        modifier = modifier
            .hoverable(interactionSource).width(327.dp)
            .height(64.dp),
        shape = RoundedCornerShape(15),
        colors = ButtonDefaults.buttonColors(containerColor = AppTheme.ButtonColors.yellow),
        ) {
        Text(
            text = "Install",
            color = Color.Black,
            style = AppTheme.TextStyle.Bold_20,
        )
    }
}
