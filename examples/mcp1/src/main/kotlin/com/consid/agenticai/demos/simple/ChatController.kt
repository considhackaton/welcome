package com.consid.agenticai.demos.simple

import org.springframework.ai.chat.ChatClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatController(private val chatClient: ChatClient) {

    @GetMapping("/chat")
    fun chat(@RequestParam message: String): String {
        return chatClient.call(message)
    }
}