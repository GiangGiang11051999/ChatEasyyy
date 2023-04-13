package com.example.composeapp.ui.notification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composeapp.R
import com.example.composeapp.navigation.ChatNavigationActions
import com.example.composeapp.ui.common.CreateButtonBack
import com.example.composeapp.ui.common.ImageCircleChat
import com.example.composeapp.ui.theme.Typography

@Composable
fun NotificationCommonScreen(
    navController: NavController,
    navigationActions: ChatNavigationActions
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        color = Color(0x242A37)
    ) {
        Column(Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(50.dp))
            CreateButtonBack(navController = navController)
            Spacer(modifier = Modifier.height(40.dp))
            ImageCircleChat(
                height = 150.dp,
                image = painterResource(id = R.drawable.ic_bell),
                isUseCircleAround = true,
                borderColor = Color.Black.copy(0.2f)
            ) {
//onClick
            }
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = "Turn on Notifications",
                style = Typography.displayLarge,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onPrimary
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Enable push notifications to let send you personal news and updates",
                style = Typography.displayMedium,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onPrimary
            )
            Spacer(modifier = Modifier.height(40.dp))
            ButtonToggleNotification(navigationActions = navigationActions)
        }
    }
}

@Composable
fun ButtonToggleNotification(navigationActions: ChatNavigationActions) {
    val isOnNotification by rememberSaveable {
        mutableStateOf(value = false)
    }
    Box(
        modifier = Modifier
            .height(67.dp)
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.onPrimary,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Row(
            Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Text(
                text = "Turn on notifications",
                color = Color.Black,
                style = Typography.displayMedium
            )
            IconButton(onClick = { !isOnNotification }) {
                Icon(
                    bitmap = ImageBitmap.imageResource(id = if (isOnNotification) R.drawable.ic_notification_on else R.drawable.ic_notification_off),
                    contentDescription = "Icon Notification "
                )
            }
        }
    }
}