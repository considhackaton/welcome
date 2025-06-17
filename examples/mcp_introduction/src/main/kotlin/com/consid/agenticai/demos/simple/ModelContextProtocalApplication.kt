package com.consid.agenticai.demos.simple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.ai.chat.ChatClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ModelContextProtocalApplication

fun main(args: Array<String>) {
    runApplication<ModelContextProtocalApplication>(*args)
}

