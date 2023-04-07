package com.example.composeapp.navigation

import com.example.composeapp.R

sealed class ChatNavigationItems(val route: String, val iconRoute: Int, val titleRoute: Int) {
    object  Home: ChatNavigationItems(ChatNavigations.HOME_ROUTE, R.drawable.ic_home_nav, R.string.title_nav_home)
    object  Stream: ChatNavigationItems(ChatNavigations.STREAMS_ROUTE, R.drawable.ic_stream_nav, R.string.title_nav_streams)
    object  Messages: ChatNavigationItems(ChatNavigations.MESSAGES_ROUTE, R.drawable.ic_message_nav, R.string.title_nav_messages)
    object  Notification: ChatNavigationItems(ChatNavigations.NOTIFICATIONS_ROUTE, R.drawable.ic_notification_nav, R.string.title_nav_notification)
    object  Profile: ChatNavigationItems(ChatNavigations.PROFILE_ROUTE, R.drawable.ic_profile_nav, R.string.title_nav_profile)
}