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
import com.example.composeapp.ui.common.CreateButtonBack
import com.example.composeapp.ui.common.OutlinedTextFieldChat
import com.example.composeapp.ui.common.TextButtonChat
import com.example.composeapp.ui.theme.Shapes
import com.example.composeapp.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateLayoutRegisterScreen(
    navController: NavHostController,
    navigationActions: ChatNavigationActions
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(vertical = 50.dp, horizontal = 20.dp)
    ) {
        CreateButtonBack(navController = navController)
        Spacer(modifier = Modifier.height(10.dp))
        LoadTitleRegister()
        Spacer(modifier = Modifier.height(50.dp))
        CreateLayoutFormRegister()
        Spacer(modifier = Modifier.height(40.dp))
        ButtonRegister()
    }
}

@Composable
fun LoadTitleRegister() {
    val context: Context = LocalContext.current
    Text(
        text = context.getString(R.string.title_signup_screen), style = Typography.headlineLarge,
        color = MaterialTheme.colorScheme.onPrimary
    )
}


@ExperimentalMaterial3Api
@Composable
fun CreateLayoutFormRegister() {
    OutlinedTextFieldChat(
        onValueChange = {

        },
        textPlaceholder = "Username",
    )
    Spacer(modifier = Modifier.height(10.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Email")

    Spacer(modifier = Modifier.height(10.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Phone")
    Spacer(modifier = Modifier.height(10.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Day of birth")
    Spacer(modifier = Modifier.height(10.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Password", isTrailing = true)
}

@Composable
fun ButtonRegister() {
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
        textId = R.string.title_button_signup,
        textColor = MaterialTheme.colorScheme.onPrimary,
        isTextAllCaps = true
    )
    Spacer(modifier = Modifier.height(30.dp))
    Text(
        text = "By clicking Sign up you agree to the following Terms and Conditions without reservation ",
        style = Typography.labelSmall,
        color = MaterialTheme.colorScheme.onPrimary,
    )
}


