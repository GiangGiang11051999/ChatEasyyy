package com.example.composeapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.ui.home.HomeScreen
import com.example.composeapp.ui.login.CreateLayoutRegisterScreen
import com.example.composeapp.ui.login.LoadLoginScreen
import com.example.composeapp.ui.login.LoadScreenForgotPassword
import com.example.composeapp.ui.main.MainScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatNavGraph(
    isExpandedScreen: Boolean,
    navigationActions: ChatNavigationActions,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ChatNavigations.MAIN_ROUTE
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ChatNavigations.MAIN_ROUTE) {
            MainScreen(navigationActions)
        }
        composable(ChatNavigations.HOME_ROUTE) {

        }
        composable(ChatNavigations.LOGIN_ROUTE) {
            LoadLoginScreen(navController = navController, navigationActions)
        }

        composable(ChatNavigations.REGISTER_ROUTE) {
            CreateLayoutRegisterScreen(navController, navigationActions)
        }
        composable(ChatNavigations.FORGOT_PASSWORD_ROUTE) {
            LoadScreenForgotPassword(navController, navigationActions)
        }
        composable(ChatNavigations.HOME_ROUTE) {
            HomeScreen(navController = navController, navigationActions = navigationActions)
        }
        composable(ChatNavigations.STREAMS_ROUTE) {
            HomeScreen(navController = navController, navigationActions = navigationActions)
        }
        composable(ChatNavigations.MESSAGES_ROUTE) {
            HomeScreen(navController = navController, navigationActions = navigationActions)
        }
        composable(ChatNavigations.PROFILE_ROUTE) {
            HomeScreen(navController = navController, navigationActions = navigationActions)
        }
        composable(ChatNavigations.NOTIFICATIONS_ROUTE) {
            HomeScreen(navController = navController, navigationActions = navigationActions)
        }
    }
}