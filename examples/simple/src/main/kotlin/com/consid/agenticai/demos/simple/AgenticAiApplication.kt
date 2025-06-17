package com.consid.agenticai.demos.simple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.ai.chat.ChatClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class AgenticAiApplication

fun main(args: Array<String>) {
    runApplication<AgenticAiApplication>(*args)
}

@RestController
class ChatController(private val chatClient: ChatClient) {

    @GetMapping("/simple")
    fun chat(): String {
        val message = "What is Agentic AI, and how is it different from regular AI assistants?"
        return chatClient.call(message)
    }
}