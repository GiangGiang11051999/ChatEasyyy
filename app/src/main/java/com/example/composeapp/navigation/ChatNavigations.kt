package com.example.composeapp.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object ChatNavigations {
    const val MAIN_ROUTE = "MainScreen"
    const val HOME_ROUTE = "HomeScreen"
    const val LOGIN_ROUTE = "LoginScreen"
    const val REGISTER_ROUTE = "RegisterScreen"
    const val FORGOT_PASSWORD_ROUTE = "ForgotPasswordScreen"
}

class ChatNavigationActions(navHostController: NavHostController) {
    val navigateToHome: () -> Unit = {
        navHostController.navigate(ChatNavigations.HOME_ROUTE) {
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToLogin: () -> Unit = {
        navHostController.navigate(ChatNavigations.LOGIN_ROUTE) {
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToRegister: () -> Unit = {
        navHostController.navigate(ChatNavigations.REGISTER_ROUTE) {
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToForgotPassword: () -> Unit = {
        navHostController.navigate(ChatNavigations.FORGOT_PASSWORD_ROUTE) {
            launchSingleTop = true
            restoreState = true
        }
    }
}