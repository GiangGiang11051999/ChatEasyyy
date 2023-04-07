package com.example.composeapp.ui.main

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatApp()

            /* ComposeAppTheme {
                 // A surface container using the 'background' color from the theme
                 MainScreen()
             }*/
        }
    }
}
