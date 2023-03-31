package com.example.composeapp.ui.login

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.ui.common.OutlinedTextFieldChat
import com.example.composeapp.ui.common.TextButtonChat
import com.example.composeapp.ui.theme.Shapes
import com.example.composeapp.ui.theme.Typography

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun loadLoginScreen() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = MaterialTheme.colorScheme.onPrimaryContainer)
            .padding(vertical = 50.dp, horizontal = 20.dp)
    ) {
        Column {
            loadTitleLogin()
            Spacer(modifier = Modifier.height(80.dp))
            formLogin()
            Spacer(modifier = Modifier.height(20.dp))
                CheckRememberPassword()
                Spacer(modifier = Modifier.height(40.dp))
                ButtonLogin()
            Spacer(modifier = Modifier.height(100.dp))
            LoginWithSocial()
        }
    }
}

@Composable
fun loadTitleLogin() {
    val context: Context = LocalContext.current
    Text(
        text = context.getString(R.string.title_button_login), style = Typography.displayLarge,
        color = MaterialTheme.colorScheme.onPrimary
    )
}

@ExperimentalMaterial3Api
@Composable
fun formLogin() {
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Username", loadingIcon = {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Icon Username"
        )
    })
    Spacer(modifier = Modifier.height(30.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Password", loadingIcon = {
        Icon(
            painter = painterResource(id = R.drawable.lock),
            contentDescription = "Icon password"
        )
    }, isTrailing = true)
}

@Composable
fun CheckRememberPassword() {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = false,
            onCheckedChange = {},
            colors = CheckboxDefaults.colors(
                checkedColor = MaterialTheme.colorScheme.onPrimary,
                disabledIndeterminateColor = MaterialTheme.colorScheme.surfaceVariant
            )
        )
        Text(
            text = "Remember me",
            style = Typography.labelSmall,
            color = MaterialTheme.colorScheme.onPrimary
        )
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {
            TextButton(onClick = { }) {
                Text(
                    text = "Forgot Password", style = Typography.displayMedium,
                    color = MaterialTheme.colorScheme.primaryContainer
                )
            }
        }

    }
}

@Composable
fun ButtonLogin() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(),
        shape = Shapes.medium,
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.onTertiaryContainer)
    ) {

        Text(
            text = "Login", style = Typography.displaySmall,
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
    TextButtonChat(
        onClickListener = { /*TODO*/ },
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(),
        textId = R.string.title_button_login,
        textColor = MaterialTheme.colorScheme.onPrimary,
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.onTertiaryContainer)
    )
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

    Spacer(modifier = Modifier.height(30.dp))

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Don't have an account?",
            style = Typography.displaySmall,
            color = MaterialTheme.colorScheme.onPrimary,
        )
        Spacer(modifier = Modifier.width(10.dp))
        TextButton(onClick = { /*TODO*/ }, modifier = Modifier.background(Color.Transparent)) {
            Text(
                text = "Sign up", style = Typography.displaySmall,
                color = MaterialTheme.colorScheme.onError
            )
        }
    }
}

