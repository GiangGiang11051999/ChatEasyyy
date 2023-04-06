package com.example.composeapp.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.R
import com.example.composeapp.navigation.ChatNavGraph
import com.example.composeapp.navigation.ChatNavigationActions
import com.example.composeapp.navigation.ChatNavigations
import com.example.composeapp.ui.theme.ComposeAppTheme
import com.example.composeapp.utils.backgrounds

@Composable
fun ChatApp() {
    ComposeAppTheme {
        val navController = rememberNavController()
        val navigationActions = remember(navController) {
            ChatNavigationActions(navController)
        }

        val coroutineScope = rememberCoroutineScope()

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route ?: ChatNavigations.MAIN_ROUTE
        val idBackgroundDrawble = backgrounds[currentRoute] ?: R.drawable.background_home_auth
        Box(
            modifier = Modifier
                .fillMaxSize()
                .drawWithContent {
                    val colors = listOf(Color.Black, Color(0x242A37).copy(0.35f))
                    drawContent()
                    drawRect(
                        brush = Brush.verticalGradient(colors),
                        blendMode = BlendMode.DstIn
                    )
                }
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer { },
                painter = painterResource(id = idBackgroundDrawble),
                contentDescription = "Background content with home login register",
                contentScale = ContentScale.FillBounds
            )
            ChatNavGraph(
                isExpandedScreen = true,
                navController = navController,
                navigationActions = navigationActions
            )
        }
    }
}