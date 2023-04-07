package com.example.composeapp.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.composeapp.navigation.ChatNavigationActions

@Composable
fun HomeScreen(
    navController: NavHostController,
    navigationActions: ChatNavigationActions
) {
    Box(modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colorScheme.onPrimary)) {

    }
}