package com.example.composeapp.ui.common

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradient
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composeapp.R

/*
///
/// Project: ComposeApp
/// Created by pc on 04/04/2023.
///
*/

@Composable
fun ImageCircleChat(
    image: Painter? = null,
    height: Dp = 100.dp,
    borderColorGradient: List<Color>,
    isUseCircleAround: Boolean = false,
    onClickListener: () -> Unit,
) {
    val heightImage = if (isUseCircleAround) height + 30.dp else height
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(heightImage)
            .clickable(enabled = true, onClick = onClickListener)
        , contentAlignment = Alignment.Center
    ) {
        if (isUseCircleAround) {
            Box(
                modifier = Modifier
                    .size(size = heightImage)
                    .border(
                        width = 10.dp,
                        brush = Brush.horizontalGradient(colors = borderColorGradient),
                        shape = CircleShape
                    )
            )
        }
        if (image != null){
            Image(
                image,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size((height))
                    .clip(CircleShape)
            )
        }
    }
}

@Composable
fun ImageCircleChat(
    image: Painter? = null,
    height: Dp = 100.dp,
    borderColor: Color = Color.Gray,
    isUseCircleAround: Boolean = false,
    onClickListener: () -> Unit,
) {
    val heightImage = if (isUseCircleAround) height + 30.dp else height
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(heightImage)
            .clickable(enabled = true, onClick = onClickListener)
        , contentAlignment = Alignment.Center
    ) {
        if (isUseCircleAround) {
            Box(
                modifier = Modifier
                    .size(size = heightImage)
                    .border(
                        width = 10.dp,
                        color = borderColor,
                        shape = CircleShape
                    )
            )
        }
        if (image != null){
            Image(
                image,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size((height))
                    .clip(CircleShape)
            )
        }
    }
}