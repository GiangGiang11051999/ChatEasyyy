package com.example.composeapp.ui.invite_friend

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composeapp.R
import com.example.composeapp.data.entity.ItemInviteFriend
import com.example.composeapp.navigation.ChatNavigationActions
import com.example.composeapp.ui.common.CreateButtonBack
import com.example.composeapp.ui.common.CreateTitleScreenTextThin
import com.example.composeapp.ui.theme.Typography

@Composable
fun InviteFriendScreen(
    navController: NavController,
    navigationActions: ChatNavigationActions
) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        color = Color(0x242A37)
    ) {
        Column(Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CreateButtonBack(navController = navController, icon = Icons.Default.Close)
                TextButton(onClick = navigationActions.navigationToInviteFriend) {
                    Text(
                        text = "Next",
                        style = Typography.displayMedium,
                        color = MaterialTheme.colorScheme.primaryContainer
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            CreateTitleScreenTextThin(titleId = R.string.title_nav_invite)
            Spacer(modifier = Modifier.height(20.dp))
            Canvas(modifier = Modifier
                .fillMaxWidth()
                .height(0.5.dp), onDraw = {
                val canvasWidth = size.width
                val canvasHeight = size.height
                drawLine(
                    start = Offset(x = -20f, y = 0f),
                    end = Offset(x = canvasWidth+20, y = canvasHeight),
                    color = Color.Black,
                    strokeWidth = 5F
                )
            })
            LazyColumn(modifier = Modifier.fillMaxWidth(), content = {
                items(listDataInvite.size) { index ->
                    ItemInviteFriendView(listDataInvite[index])
                }
            })
        }
    }

}

/*
* test list*/
val listDataInvite = listOf<ItemInviteFriend>(
    ItemInviteFriend("Giang", isInvited = true),
    ItemInviteFriend("Ngọc Hà "),
    ItemInviteFriend("Giang", isInvited = true),
    ItemInviteFriend("Ngọc Hà "),
    ItemInviteFriend("Giang", isInvited = true),
    ItemInviteFriend("Ngọc Hà "),
    ItemInviteFriend("Giang", isInvited = true),
    ItemInviteFriend("Ngọc Hà "),
    ItemInviteFriend("Giang", isInvited = true),
    ItemInviteFriend("Ngọc Hà ")
)