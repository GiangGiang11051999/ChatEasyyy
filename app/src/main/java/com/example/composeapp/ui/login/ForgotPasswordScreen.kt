package com.example.composeapp.ui.login

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.composeapp.R
import com.example.composeapp.navigation.ChatNavigationActions
import com.example.composeapp.ui.common.OutlinedTextFieldChat
import com.example.composeapp.ui.common.TextButtonChat
import com.example.composeapp.ui.theme.Shapes
import com.example.composeapp.ui.theme.Typography

@ExperimentalMaterial3Api
@Composable
fun LoadScreenForgotPassword(
    navController: NavHostController,
    navigationActions: ChatNavigationActions
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(vertical = 50.dp, horizontal = 20.dp)
    ) {
        Column {
            IconButton(
                onClick = { navController.popBackStack() }, modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Close",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            LoadTitleForgotPassword()
            Spacer(modifier = Modifier.height(50.dp))
            FormConfirmPassword()
            Spacer(modifier = Modifier.height(40.dp))
            ButtonConfirm()
        }
    }
}

@Composable
fun LoadTitleForgotPassword() {
    val context: Context = LocalContext.current
    Text(
        text = context.getString(R.string.title_forgot_password), style = Typography.headlineLarge,
        color = MaterialTheme.colorScheme.onPrimary
    )
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        text = context.getString(R.string.title_forgot_password1), style = Typography.displayMedium,
        color = MaterialTheme.colorScheme.onPrimary
    )
}

@ExperimentalMaterial3Api
@Composable
fun FormConfirmPassword() {
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Your email")
}

@Composable
fun ButtonConfirm() {
    TextButtonChat(
        onClickListener = { /*TODO*/ },
        modifier = Modifier
            .height(55.dp)
            .fillMaxWidth()
            .background(
                shape = Shapes.medium,
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.primaryContainer,
                        MaterialTheme.colorScheme.primary,
                    ),
                    startX = 0f,
                    endX = 500f
                ),
            ),
        textId = R.string.title_send,
        textColor = MaterialTheme.colorScheme.onPrimary,
        isTextAllCaps = true
    )
}
