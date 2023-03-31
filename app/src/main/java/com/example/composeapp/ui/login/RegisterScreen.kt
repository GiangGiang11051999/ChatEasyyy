package com.example.composeapp.ui.login

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.ui.common.OutlinedTextFieldChat
import com.example.composeapp.ui.common.TextButtonChat
import com.example.composeapp.ui.theme.Shapes
import com.example.composeapp.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun CreateLayoutRegisterScreen() {
    Column {
        LoadTitleRegister()
        Spacer(modifier = Modifier.height(80.dp))
        CreateLayoutFormRegister()
        CheckPolicy()
        Spacer(modifier = Modifier.height(20.dp))
        ButtonRegister()
    }
}

@Composable
fun LoadTitleRegister() {
    val context: Context = LocalContext.current
    Text(
        text = context.getString(R.string.title_button_signup), style = Typography.displayLarge,
        color = MaterialTheme.colorScheme.onPrimary
    )
}


@ExperimentalMaterial3Api
@Composable
fun CreateLayoutFormRegister() {
    Row(modifier = Modifier.fillMaxWidth()) {
        OutlinedTextFieldChat(
            onValueChange = {

            },
            textPlaceholder = "First Name",
            modifier = Modifier
                .wrapContentWidth(Alignment.Start)
                .weight(1f)
                .height(60.dp),
        )
        Spacer(modifier = Modifier.width(20.dp))
        OutlinedTextFieldChat(
            onValueChange = {

            },
            textPlaceholder = "Last Name",
            modifier = Modifier
                .wrapContentWidth(Alignment.Start)
                .weight(1f)
                .height(60.dp),
        )
    }
    Spacer(modifier = Modifier.height(15.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Email")

    Spacer(modifier = Modifier.height(15.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Email")
    Spacer(modifier = Modifier.height(15.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Password", isTrailing = true)
    Spacer(modifier = Modifier.height(15.dp))
    OutlinedTextFieldChat(onValueChange = {

    }, textPlaceholder = "Confirm Password", isTrailing = true)
}


@Composable
fun CheckPolicy() {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = true,
            onCheckedChange = {},
            colors = CheckboxDefaults.colors(
                checkedColor = MaterialTheme.colorScheme.onPrimary,
                disabledIndeterminateColor = MaterialTheme.colorScheme.surfaceVariant
            )
        )
        Text(
            text = "I Agree with ",
            style = Typography.labelSmall,
            color = MaterialTheme.colorScheme.onPrimary
        )
        Text(
            text = "privacy ",
            style = Typography.labelSmall,
            color = MaterialTheme.colorScheme.onError
        )
        Text(
            text = "and ",
            style = Typography.labelSmall,
            color = MaterialTheme.colorScheme.onPrimary
        )
        Text(
            text = "policy ",
            style = Typography.labelSmall,
            color = MaterialTheme.colorScheme.onError
        )
    }
}

@Composable
fun ButtonRegister() {
    TextButtonChat(
        onClickListener = { /*TODO*/ },
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(),
        textId = R.string.title_button_signup,
        textColor = MaterialTheme.colorScheme.onPrimary,
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.onTertiaryContainer)
    )
    Spacer(modifier = Modifier.height(30.dp))
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Already have an account?",
            style = Typography.displaySmall,
            color = MaterialTheme.colorScheme.onPrimary,
        )
        Spacer(modifier = Modifier.width(10.dp))
        TextButton(onClick = { /*TODO*/ }, modifier = Modifier.background(Color.Transparent)) {
            Text(
                text = LocalContext.current.getString(R.string.title_button_login),
                style = Typography.displaySmall,
                color = MaterialTheme.colorScheme.onError
            )
        }
    }
}


