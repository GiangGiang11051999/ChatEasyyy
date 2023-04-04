package com.example.composeapp.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.composeapp.R


val robotoFontFamilys = FontFamily(
    Font(R.font.roboto_black,FontWeight.Black),
    Font(R.font.roboto_black_italic,  FontWeight.Black, FontStyle.Italic),
    Font(R.font.roboto_bold, FontWeight.Bold, ),
    Font(R.font.roboto_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.roboto_egular, FontWeight.W400),
    Font(R.font.roboto_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.roboto_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.roboto_medium, FontWeight.Medium, FontStyle.Normal),
    Font(R.font.roboto_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.roboto_talic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.roboto_thin, FontWeight.Thin, FontStyle.Normal),
    Font(R.font.roboto_thin_italic, FontWeight.Thin, FontStyle.Italic)
)