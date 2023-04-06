package com.example.composeapp.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


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
