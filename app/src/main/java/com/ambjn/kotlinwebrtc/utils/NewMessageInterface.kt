package com.ambjn.kotlinwebrtc.utils

import com.ambjn.kotlinwebrtc.models.MessageModel

interface NewMessageInterface {
    fun onNewMessage(message: MessageModel)
}