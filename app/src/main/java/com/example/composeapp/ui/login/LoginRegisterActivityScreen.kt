package com.example.composeapp.ui.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.ui.theme.ComposeAppTheme

class LoginRegisterActivityScreen : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .drawWithContent {
                            val colors = listOf(Color.Black, Color(0x242A37).copy(0.35f))
                            drawContent()
                            drawRect(
                                brush = Brush.verticalGradient(colors),
                                blendMode = BlendMode.DstIn
                            )
                        }
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxSize()
                            .graphicsLayer { },
                        painter = painterResource(id = R.drawable.bg_register_account),
                        contentDescription = "Background content with home login register",
                        contentScale = ContentScale.FillBounds
                    )
                    CreateLayoutRegisterScreen()
                }
            }
        }
    }
}