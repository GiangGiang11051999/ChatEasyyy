package com.example.composeapp.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object ChatNavigations {
    const val MAIN_ROUTE = "MainScreen"
    const val HOME_ROUTE = "HomeScreen"
    const val LOGIN_ROUTE = "LoginScreen"
    const val REGISTER_ROUTE = "RegisterScreen"
    const val FORGOT_PASSWORD_ROUTE = "ForgotPasswordScreen"
    const val STREAMS_ROUTE = "StreamScreen"
    const val MESSAGES_ROUTE = "MessagesScreen"
    const val NOTIFICATIONS_ROUTE = "NotificationsScreen"
    const val PROFILE_ROUTE = "ProfileScreen"
    const val NOTIFICATION_COMMON_ROUTE = "NotificationCommonScreen"
    const val INVITE_FRIEND_ROUTE = "InviteFriendScreen"
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
    val navigateToNotificationCommon: () -> Unit = {
        navHostController.navigate(ChatNavigations.NOTIFICATION_COMMON_ROUTE) {
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToStreams: () -> Unit = {
        navHostController.navigate(ChatNavigations.STREAMS_ROUTE) {
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToMessages: () -> Unit = {
        navHostController.navigate(ChatNavigations.MESSAGES_ROUTE) {
            launchSingleTop = true
            restoreState = true
        }
    }

    val navigateToNotifications: () -> Unit = {
        navHostController.navigate(ChatNavigations.NOTIFICATIONS_ROUTE) {
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToProfiles: () -> Unit = {
        navHostController.navigate(ChatNavigations.PROFILE_ROUTE) {
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigationToInviteFriend: () -> Unit = {
        navHostController.navigate(ChatNavigations.INVITE_FRIEND_ROUTE) {
            launchSingleTop = true
            restoreState = true
        }
    }
}