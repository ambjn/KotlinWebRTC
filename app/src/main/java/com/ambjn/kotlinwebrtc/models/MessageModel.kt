package com.ambjn.kotlinwebrtc.models

data class MessageModel(
    val type: String,
    val target: String? = null,
    val name: String? = null,
    val data: Any? = null,
)
