package com.example.composeapp.ui.common

import android.content.Context
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composeapp.R
import com.example.composeapp.ui.theme.Typography

@Composable
fun CreateButtonBack(navController: NavController, icon: ImageVector = Icons.Default.ArrowBack) {
    IconButton(
        onClick = { navController.popBackStack() }, modifier = Modifier
            .height(30.dp)
            .width(30.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "Close",
            tint = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@Composable
fun CreateTitleScreen(titleId: Int) {
    val context: Context = LocalContext.current
    Text(
        text = context.getString(titleId), style = Typography.headlineLarge,
        color = MaterialTheme.colorScheme.onPrimary
    )
}


@Composable
fun CreateTitleScreenTextThin(titleId: Int) {
    val context: Context = LocalContext.current
    Text(
        text = context.getString(titleId), style = Typography.titleLarge,
        color = MaterialTheme.colorScheme.onPrimary
    )
}