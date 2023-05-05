package com.example.composeapp.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.composeapp.navigation.ChatNavigationActions
import com.example.composeapp.ui.common.BaseLayout
import com.example.composeapp.ui.common.SearchViewChat

@Composable
fun HomeScreen(
    navController: NavHostController,
    navigationActions: ChatNavigationActions
) {
    BaseLayout {
        Column {
            SearchViewChat{

            }
        }
    }
}