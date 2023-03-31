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
import androidx.compose.ui.unit.dp
import com.example.composeapp.ui.theme.Typography

@Composable
fun TextButtonChat(
    onClickListener: () -> Unit,
    modifier: Modifier,
    textId: Int,
    textColor: Color,
    colors: ButtonColors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
) {
    Box(
        modifier = Modifier
            .padding(horizontal = 30.dp)
    ) {
        Button(
            onClick = onClickListener,
            enabled = true,
            modifier = modifier,
            colors = colors
        ) {
            Text(
                text = LocalContext.current.getString(textId),
                style = Typography.displaySmall,
                color = textColor
            )
        }
    }
}
