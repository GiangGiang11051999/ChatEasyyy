package com.example.composeapp.ui.login

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
fun LoadLoginScreen(navController: NavHostController, navigationActions: ChatNavigationActions) {

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
            loadTitleLogin()
            Spacer(modifier = Modifier.height(50.dp))
            formLogin()

            Spacer(modifier = Modifier.height(40.dp))
            ButtonLogin(navigationActions)
            Spacer(modifier = Modifier.height(100.dp))
            LoginWithSocial()
        }
    }
}

@Composable
fun loadTitleLogin() {
    val context: Context = LocalContext.current
    Text(
        text = context.getString(R.string.title_welcome_back), style = Typography.headlineLarge,
        color = MaterialTheme.colorScheme.onPrimary
    )
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        text = context.getString(R.string.title_welcome_back1), style = Typography.displayMedium,
        color = MaterialTheme.colorScheme.onPrimary
    )
}

@ExperimentalMaterial3Api
@Composable
fun formLogin() {
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Email")
    Spacer(modifier = Modifier.height(30.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Password", isTrailing = true)
}

@Composable
fun ButtonLogin(navigationActions: ChatNavigationActions) {
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
        textId = R.string.title_button_login,
        textColor = MaterialTheme.colorScheme.onPrimary,
        isTextAllCaps = true
    )
    Spacer(modifier = Modifier.height(10.dp))
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        TextButton(onClick = navigationActions.navigateToForgotPassword) {
            Text(
                text = "Forgot your password?", style = Typography.displayMedium,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Composable
fun LoginWithSocial() {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = "Or Sign in with",
        style = Typography.displaySmall,
        color = MaterialTheme.colorScheme.onPrimary
    )
    Spacer(modifier = Modifier.height(20.dp))
    Row(modifier = Modifier.fillMaxWidth(), Arrangement.Center) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(28.dp)
                .height(28.dp)
                .background(MaterialTheme.colorScheme.onPrimary, shape = RoundedCornerShape(10.dp)),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_facebook_n_bg),
                contentDescription = "Login with facebookX",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            )
        }
        Spacer(modifier = Modifier.width(30.dp))
        IconButton(
            onClick = { /*TODO*/ }, modifier = Modifier
                .width(28.dp)
                .height(28.dp)
                .background(MaterialTheme.colorScheme.onPrimary, shape = RoundedCornerShape(10.dp))
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_twitter_n_bg),
                contentDescription = "Login with twitter",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            )
        }
        Spacer(modifier = Modifier.width(30.dp))

        IconButton(
            onClick = { /*TODO*/ }, modifier = Modifier
                .width(28.dp)
                .height(28.dp)
                .background(MaterialTheme.colorScheme.onPrimary, shape = RoundedCornerShape(10.dp))
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_google_n_bg),
                contentDescription = "Login with google",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            )
        }
        Spacer(modifier = Modifier.width(30.dp))
        IconButton(
            onClick = { /*TODO*/ }, modifier = Modifier
                .width(28.dp)
                .height(28.dp)
                .background(MaterialTheme.colorScheme.onPrimary, shape = RoundedCornerShape(10.dp))
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_instagram),
                contentDescription = "Login with instagram",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            )
        }

    }
}

