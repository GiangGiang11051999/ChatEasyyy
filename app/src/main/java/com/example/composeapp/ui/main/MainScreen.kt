package com.example.composeapp.ui.main

import android.content.Intent
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.ui.common.TextButtonChat
import com.example.composeapp.ui.login.LoginRegisterActivityScreen
import com.example.composeapp.ui.theme.Shapes
import com.example.composeapp.ui.theme.Typography


@Preview(showBackground = true, name = "GiangGiang")
@Composable
fun renderLayoutMain() {

    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background_home_auth),
            contentDescription = "Background content with home login register",
            contentScale = ContentScale.FillBounds
        )
        TextContentSplash()
    }
}

@Composable
fun TextContentSplash() {
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxHeight()) {
        Spacer(modifier = Modifier.height(250.dp))
        Text(
            text = context.getString(R.string.title_content_header),
            style = Typography.displayLarge,
            color = MaterialTheme.colorScheme.onPrimary
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = context.getString(R.string.title_content_header_1),
            style = Typography.displayMedium,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(horizontal = 30.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))
        TextButtonChat(
            onClickListener = {
                Log.d("TAG", "TextContentSplash: log in called....")
                context.startActivity(
                    Intent(
                        context,
                        LoginRegisterActivityScreen::class.java
                    )
                )
            },
            modifier = CreateBackgroundButton(
                listColors = listOf(
                    MaterialTheme.colorScheme.onPrimary,
                    MaterialTheme.colorScheme.onPrimary
                )
            ),
            textId = R.string.title_button_login,
            textColor = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextButtonChat(
            onClickListener = {
                Log.d("TAG", "TextContentSplash: sign up called....")
                context.startActivity(
                    Intent(
                        context,
                        LoginRegisterActivityScreen::class.java
                    )
                )
            },
            modifier = CreateBackgroundButton(
                listColors = listOf(
                    MaterialTheme.colorScheme.onPrimaryContainer,
                    MaterialTheme.colorScheme.primary,
                )
            ),
            textId = R.string.title_button_signup,
            textColor = MaterialTheme.colorScheme.onPrimary
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = context.getString(R.string.title_header_8),
            style = Typography.displaySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_facebook),
                    contentDescription = "login with facebook",
                    tint = colorResource(id = R.color.on_primary)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "login with google",
                    tint = colorResource(id = R.color.on_primary)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            IconButton(onClick = {
                context.startActivity(
                    Intent(
                        context,
                        LoginRegisterActivityScreen::class.java
                    )
                )
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_twitter_n_bg),
                    contentDescription = "login with twitter",
                    tint = colorResource(id = R.color.on_primary)
                )
            }
        }
    }
}


@Composable
fun CreateBackgroundButton(listColors: List<Color>): Modifier = Modifier
    .height(60.dp)
    .fillMaxWidth()
    .background(
        shape = Shapes.medium,
        brush = Brush.horizontalGradient(
            colors = listColors,
            startX = 0f,
            endX = 500f
        ),
    )


