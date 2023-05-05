package com.example.composeapp.navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.composeapp.ui.theme.Typography

@Composable
fun ChatBottomNavigation(
    navController: NavController,
) {
    val listItems = listOf(
        ChatNavigationItems.Home,
        ChatNavigationItems.Stream,
        ChatNavigationItems.Messages,
        ChatNavigationItems.Notification,
        ChatNavigationItems.Profile
    )
    Row {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute =
            navBackStackEntry?.destination?.route ?: ChatNavigations.HOME_ROUTE
        AnimatedVisibility(visible = listItems.map { it.route }.contains(currentRoute)) {
            BottomNavigation(
                backgroundColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.primaryContainer,
                modifier = Modifier.displayCutoutPadding()
            ) {

                listItems.forEach {
                    BottomNavigationItem(
                        icon = {
                            Icon(
                                painter = painterResource(id = it.iconRoute),
                                contentDescription = "Icon Route",
                                tint = if (currentRoute == it.route) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier
                                    .width(24.dp)
                                    .height(24.dp)
                            )
                        },
                        label = {
                            Text(
                                text = LocalContext.current.getString(it.titleRoute),
                                color = if (currentRoute == it.route) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.onSurfaceVariant,
                                style = Typography.labelMedium,
                                textAlign = TextAlign.Center,
                                maxLines = 1
                            )
                        },
                        selectedContentColor = MaterialTheme.colorScheme.primaryContainer,
                        unselectedContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                        selected = currentRoute == it.route,
                        onClick = {
                            navController.navigate(it.route)
                        })
                }
            }
        }
    }
}