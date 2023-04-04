package com.example.composeapp.ui.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composeapp.ui.theme.Typography

@Composable
fun TextButtonChat(
    onClickListener: () -> Unit,
    modifier: Modifier,
    textId: Int,
    textColor: Color,
    colors: ButtonColors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
    paddingLayout: Dp = 0.dp,
    isTextAllCaps: Boolean = false
) {
    val textBtn = if (isTextAllCaps) LocalContext.current.getString(textId)
        .uppercase() else LocalContext.current.getString(textId)
    Box(
        modifier = Modifier
            .padding(horizontal = paddingLayout)
    ) {
        Button(
            onClick = onClickListener,
            enabled = true,
            modifier = modifier,
            colors = colors
        ) {
            Text(
                text = textBtn,
                style = Typography.displaySmall,
                color = textColor
            )
        }
    }
}
