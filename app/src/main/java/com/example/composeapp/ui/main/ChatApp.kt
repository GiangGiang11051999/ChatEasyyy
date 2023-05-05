package com.example.composeapp.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
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
import com.example.composeapp.navigation.ChatBottomNavigation
import com.example.composeapp.navigation.ChatNavGraph
import com.example.composeapp.navigation.ChatNavigationActions
import com.example.composeapp.navigation.ChatNavigations
import com.example.composeapp.ui.theme.ComposeAppTheme
import com.example.composeapp.utils.backgrounds

@OptIn(ExperimentalMaterial3Api::class)
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
        val idBackgroundDrawble = backgrounds[currentRoute]
        Scaffold(
            topBar = {},
            content = { padding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding)
                ) {
                    idBackgroundDrawble?.let {
                        Image(
                            modifier = Modifier
                                .fillMaxSize()
                                .graphicsLayer { }
                                .drawWithContent {
                                    val colors = listOf(Color.Black, Color(0x242A37).copy(0.35f))
                                    drawContent()
                                    drawRect(
                                        brush = Brush.verticalGradient(colors),
                                        blendMode = BlendMode.DstIn
                                    )
                                },
                            painter = painterResource(id = idBackgroundDrawble),
                            contentDescription = "Background content with home login register",
                            contentScale = ContentScale.FillBounds
                        )
                    }

                    ChatNavGraph(
                        isExpandedScreen = true,
                        navController = navController,
                        navigationActions = navigationActions
                    )
                }
            },
            bottomBar = {
                ChatBottomNavigation(
                    navController = navController,
                )
            },
        )

    }
}