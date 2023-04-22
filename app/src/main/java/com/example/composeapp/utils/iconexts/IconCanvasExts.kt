package com.example.composeapp.utils.iconexts

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun NotificationIconEnable() {
    Canvas(
        modifier = Modifier
            .height(32.dp)
            .width(62.dp)
    ) {
        drawRoundRect(
            Color(color = 0xff00FF2B).copy(0.99f),
            size = Size(170f, 88f),
            cornerRadius = CornerRadius(50f, 50f)
        )
        drawIntoCanvas {
            val paint = Paint()
            val frameworkPaint = paint.asFrameworkPaint()
            frameworkPaint.color = Color.Transparent.toArgb()
            frameworkPaint.setShadowLayer(
                50f,
                15f,
                30f,
                Color.Black.toArgb()
            )
            it.drawCircle( Offset(125f, 43.5f), radius = 40f, paint)
           drawCircle(Color.White, center = Offset(125f, 43.5f), radius = 35f)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun NotificationIconDisable() {
    Canvas(
        modifier = Modifier
            .height(32.dp)
            .width(62.dp)
    ) {
        drawRoundRect(
            Color(color = 0xCCCCCCC).copy(0.99f),
            size = Size(170f, 88f),
            cornerRadius = CornerRadius(50f, 50f)
        )
        drawIntoCanvas {
            val paint = Paint()
            val frameworkPaint = paint.asFrameworkPaint()
            frameworkPaint.color = Color.Transparent.toArgb()
            frameworkPaint.setShadowLayer(
                50f,
                15f,
                30f,
                Color.Black.toArgb()
            )
            it.drawCircle( Offset(30f, 30f), radius = 40f, paint)
            drawCircle(Color.White, center = Offset(45f, 43.5f), radius = 35f)
        }

    }
}