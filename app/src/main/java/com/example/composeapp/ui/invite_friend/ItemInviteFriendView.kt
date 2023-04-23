package com.example.composeapp.ui.invite_friend

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.data.entity.ItemInviteFriend
import com.example.composeapp.ui.theme.Typography
import com.example.composeapp.utils.iconexts.AddInviteFriendIcon
import com.example.composeapp.utils.iconexts.CheckInviteFriendIcon

@Composable
fun ItemInviteFriendView(itemData: ItemInviteFriend) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(vertical = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box {
                Row(Modifier.fillMaxHeight(), verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.image_fri),
                        contentDescription = "Image Friend",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column() {
                        Text(
                            text = itemData.titleName,
                            style = Typography.bodySmall,
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                        Text(
                            text = "You’re friends on Facebook",
                            style = Typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
            /* Icon(
                 painter = painterResource(id = if (itemData.isInvited) R.drawable.ic_check_invite else R.drawable.ic_add_invite),
                 contentDescription = "Icon Invite Status",
                 modifier = Modifier
                     .width(30.dp)
                     .height(30.dp)
             )*/
            if (itemData.isInvited) CheckInviteFriendIcon() else AddInviteFriendIcon()
        }
        Canvas(modifier = Modifier
            .fillMaxWidth()
            .height(0.5.dp), onDraw = {
            val canvasWidth = size.width
            val canvasHeight = size.height
            drawLine(
                start = Offset(x = 0f, y = 0f),
                end = Offset(x = canvasWidth, y = canvasHeight),
                color = Color.Black,
                strokeWidth = 5F
            )
        })
    }
}

