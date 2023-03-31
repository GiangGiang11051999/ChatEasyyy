package com.example.composeapp.ui.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextFieldChat(
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .height(60.dp),
    textPlaceholder: String = "",
    colorPlaceholder: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    stylePlaceholder: TextStyle = Typography.labelSmall,
    colors: TextFieldColors = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = MaterialTheme.colorScheme.primaryContainer,
        unfocusedBorderColor = MaterialTheme.colorScheme.primaryContainer,
        disabledBorderColor = MaterialTheme.colorScheme.primaryContainer,
        containerColor = Color.Transparent,
        cursorColor = MaterialTheme.colorScheme.onSurfaceVariant,
        textColor =  MaterialTheme.colorScheme.primaryContainer,
    ),
    loadingIcon: @Composable () -> Unit = {

    },
    dpShape: RoundedCornerShape = RoundedCornerShape(30.dp),
    onValueChange: (TextFieldValue) -> Unit,
    trailingIconIdEnable: Int = R.drawable.ic_show,
    trailingIconIdDisable: Int = R.drawable.ic_hide,
    isTrailing: Boolean = false
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
                modifier = Modifier.fillMaxWidth()
            )
        },
        shape = dpShape,
        colors = colors,
        leadingIcon = loadingIcon,
        trailingIcon = {
            if (isTrailing) {
                val image = if (endIconVisible)
                    painterResource(id = trailingIconIdEnable)
                else painterResource(id = trailingIconIdDisable)
                val description = if (endIconVisible) "Hide icon" else "Show icon"

                IconButton(onClick = { endIconVisible = !endIconVisible }) {
                    Icon(painter = image, contentDescription = description)
                }
            }
        }
    )
}