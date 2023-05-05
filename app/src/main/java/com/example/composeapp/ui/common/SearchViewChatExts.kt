package com.example.composeapp.ui.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.Shapes
import com.example.composeapp.ui.theme.Typography
import com.example.composeapp.ui.theme.robotoFontFamilys

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchViewChat(
    modifier: Modifier = Modifier
        .height(50.dp)
        .fillMaxWidth()
        .padding(horizontal = 20.dp),
    iconLeading: @Composable () -> Unit = {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Icon search",
            tint = MaterialTheme.colorScheme.onPrimary
        )
    },
    textPlaceholder: String = "Search",
    colorPlaceholder: Color = Color(0xFF4E586E),
    stylePlaceholder: TextStyle = TextStyle(
        fontFamily = robotoFontFamilys,
        fontWeight = FontWeight.Thin,
        fontStyle = FontStyle.Italic,
        fontSize = 15.sp,
    ),
    colors: TextFieldColors = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = Color.Transparent,
        unfocusedBorderColor = Color.Transparent,
        disabledBorderColor = Color.Transparent,
        containerColor = Color(0xFF8E8E93).copy(0.12f),
        cursorColor = Color.White,
        textColor = Color.White,
    ),
    dpShape: CornerBasedShape = Shapes.medium,
    onValueChange: (TextFieldValue) -> Unit,
) {
    var endIconVisible by rememberSaveable {
        mutableStateOf(value = false)
    }
    var textChange by remember {
        mutableStateOf(value = TextFieldValue(""))
    }
    OutlinedTextField(
        value = textChange,
        onValueChange = {
            textChange = it
            onValueChange.invoke(it)
        },
        modifier = modifier,
        placeholder = {
            Text(
                text = textPlaceholder, style = stylePlaceholder,
                color = colorPlaceholder,
                modifier = Modifier.fillMaxWidth(),
            )
        },
        shape = dpShape,
        colors = colors,
        leadingIcon = iconLeading
    )
}