package com.example.composeapp.ui.theme

import android.app.Activity
import android.os.Build
import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat

private val DarkColorPalette = darkColorScheme(
    primary = replyDarkPrimary,
    onPrimary = replyDarkOnPrimary,
    primaryContainer = replyDarkPrimaryContainer,
    onPrimaryContainer = replyDarkOnPrimaryContainer,
    inversePrimary = replyDarkPrimaryInverse,
    secondary = replyDarkSecondary,
    onSecondary = replyDarkOnSecondary,
    secondaryContainer = replyDarkSecondaryContainer,
    onSecondaryContainer = replyDarkOnSecondaryContainer,
    tertiary = replyDarkTertiary,
    onTertiary = replyDarkOnTertiary,
    tertiaryContainer = replyDarkTertiaryContainer,
    onTertiaryContainer = replyDarkOnTertiaryContainer,
    error = replyDarkError,
    onError = replyDarkOnError,
    errorContainer = replyDarkErrorContainer,
    onErrorContainer = replyDarkOnErrorContainer,
    background = replyDarkBackground,
    onBackground = replyDarkOnBackground,
    surface = replyDarkSurface,
    onSurface = replyDarkOnSurface,
    inverseSurface = replyDarkInverseSurface,
    inverseOnSurface = replyDarkInverseOnSurface,
    surfaceVariant = replyDarkSurfaceVariant,
    onSurfaceVariant = replyDarkOnSurfaceVariant,
    outline = replyDarkOutline
)

private val LightColorPalette = lightColorScheme(
    primary = replyLightPrimary,
    onPrimary = replyLightOnPrimary,
    primaryContainer = replyLightPrimaryContainer,
    onPrimaryContainer = replyLightOnPrimaryContainer,
    inversePrimary = replyLightPrimaryInverse,
    secondary = replyLightSecondary,
    onSecondary = replyLightOnSecondary,
    secondaryContainer = replyLightSecondaryContainer,
    onSecondaryContainer = replyLightOnSecondaryContainer,
    tertiary = replyLightTertiary,
    onTertiary = replyLightOnTertiary,
    tertiaryContainer = replyLightTertiaryContainer,
    onTertiaryContainer = replyLightOnTertiaryContainer,
    error = replyLightError,
    onError = replyLightOnError,
    errorContainer = replyLightErrorContainer,
    onErrorContainer = replyLightOnErrorContainer,
    background = replyLightBackground,
    onBackground = replyLightOnBackground,
    surface = replyLightSurface,
    onSurface = replyLightOnSurface,
    inverseSurface = replyLightInverseSurface,
    inverseOnSurface = replyLightInverseOnSurface,
    surfaceVariant = replyLightSurfaceVariant,
    onSurfaceVariant = replyLightOnSurfaceVariant,
    outline = replyLightOutline
)

@Composable
fun ComposeAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val replyColorScheme = when {
        darkTheme && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            Log.d("TAG", "ComposeAppTheme: case 1 ")
            val context = LocalContext.current
            if (darkTheme) DarkColorPalette else LightColorPalette
        }
        darkTheme ->{
            Log.d("TAG", "ComposeAppTheme: case 2 ")
            DarkColorPalette
        }
        else -> {
            Log.d("TAG", "ComposeAppTheme: case 3 ")
            LightColorPalette
        }
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = replyColorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }
    androidx.compose.material3.MaterialTheme(
        colorScheme = replyColorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}