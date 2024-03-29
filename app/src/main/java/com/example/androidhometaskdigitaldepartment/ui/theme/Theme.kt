package com.example.androidhometaskdigitaldepartment.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
background = Color(0xFFFFFBFE),
surface = Color(0xFFFFFBFE),
onPrimary = Color.White,
onSecondary = Color.White,
onTertiary = Color.White,
onBackground = Color(0xFF1C1B1F),
onSurface = Color(0xFF1C1B1F),
*/
)

@Composable
fun AndroidHometaskDigitalDepartmentTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

object AppTheme {
    object BgColors {
        val greyBackground = Dark_grey
        val border = BorderGrey
        val divider = DarkDivider
        val chipBackgroundColor = backChip
        val third = Third
        val circuit = Circuit
    }

    object ButtonColors {
        val yellow = Yellow
    }

    object TextColors {
        val greyText = Bright_grey
        val whiteText = White
        val downloadsText = VeryGrey
        val dateText = DateGrey
        val commentText = commentGrey
        val chipTextColor = blueChip
    }

    object TextStyle {
        val Regular_12_19
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
                lineHeight = 19.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                ),
            )
        val Regular_12_20
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
                lineHeight = 20.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                ),
                letterSpacing = 0.5.sp,
            )
        val Bold_20
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontSize = 20.sp,
                fontWeight = FontWeight(700),
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                ),
                letterSpacing = 0.6.sp,
            )
        val Bold_20_26
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontSize = 20.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(700),
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                ),
                letterSpacing = 0.5.sp,
            )
        val Regular_12_05
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontSize = 12.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                ),
                letterSpacing = 0.5.sp,
            )
        val Regular_16
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontSize = 16.sp,
                fontWeight = FontWeight(700),
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                ),
                letterSpacing = 0.5.sp,
            )
        val Regular_48
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontSize = 48.sp,
                fontWeight = FontWeight(700),
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                ),
            )
        val Regular_12_05_400
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                ),
                letterSpacing = 0.5.sp,
            )
        val Regular_10_500
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                platformStyle = PlatformTextStyle(includeFontPadding = false),
            )
    }
}