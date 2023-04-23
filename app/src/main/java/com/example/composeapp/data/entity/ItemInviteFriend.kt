package com.example.composeapp.data.entity

data class ItemInviteFriend(
    val titleName : String = "",
    val image: Int? = null,
    val isFriendOnFb: Boolean = false,
    val isInvited : Boolean = false
)