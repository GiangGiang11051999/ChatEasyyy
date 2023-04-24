package com.example.composeapp.ui.theme

import android.app.Activity
import android.os.Build
import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

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
        darkTheme -> {
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
            //   window.statusBarColor = replyColorScheme.background.toArgb()
            // window.navigationBarColor = replyColorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
            WindowCompat.setDecorFitsSystemWindows(window, false)
            ViewCompat.setOnApplyWindowInsetsListener(view) { view, windowInsets ->
                val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
                // Apply the insets as padding to the view. Here we're setting all of the
                // dimensions, but apply as appropriate to your layout. You could also
                // update the views margin if more appropriate.
                view.updatePadding(insets.left, insets.top, insets.right, insets.bottom)
                // Return CONSUMED if we don't want the window insets to keep being passed
                // down to descendant views.
                WindowInsetsCompat.CONSUMED
            }
        }
    }
    androidx.compose.material3.MaterialTheme(
        colorScheme = replyColorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}