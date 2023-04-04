package com.example.composeapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.composeapp.R

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontSize = 42.sp,
        fontFamily = robotoFontFamilys,
        fontWeight = FontWeight.Black,
    ),
    headlineLarge = TextStyle(
        fontSize = 38.sp,
        fontFamily = robotoFontFamilys,
        fontWeight = FontWeight.Black,
    ),
    displayMedium = TextStyle(
        fontSize = 17.sp,
        fontStyle = FontStyle.Italic,
        fontFamily = robotoFontFamilys,
        fontWeight = FontWeight.Thin,
    ),
    displaySmall = TextStyle(
        fontFamily = robotoFontFamilys,
        fontWeight = FontWeight.Thin,
        fontStyle = FontStyle.Italic,
        fontSize = 15.sp,
        textAlign = TextAlign.Center
    ),
    labelSmall = TextStyle(
        fontFamily = robotoFontFamilys,
        fontWeight = FontWeight.Thin,
        fontStyle = FontStyle.Italic,
        fontSize = 13.sp,
        textAlign = TextAlign.Center
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)