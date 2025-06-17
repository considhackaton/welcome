package com.consid.agenticai.demos.simple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.ai.chat.ChatClient
import org.springframework.ai.chat.messages.SystemMessage
import org.springframework.ai.chat.messages.UserMessage
import org.springframework.ai.chat.prompt.Prompt
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class AgenticAiApplication

fun main(args: Array<String>) {
    runApplication<AgenticAiApplication>(*args)
}

@RestController
class Agent2AgentController(private val chatClient: ChatClient) {

    @GetMapping("/a2a")
    fun agentToAgentFlow(@RequestParam topic: String): String {

        val generatorPrompt = Prompt(
            listOf(
                SystemMessage(
                    """
                Role: Idea Generator
                Goal: Create an original idea or summary about a topic.
                Style: Creative and open-minded.
                Context: The user has given a broad theme to explore.
            """.trimIndent()
                ),
                UserMessage("Generate a fresh idea about: $topic")
            )
        )
        val rawIdea = chatClient.call(generatorPrompt).result.output.content

        val refinerPrompt = Prompt(listOf(
            SystemMessage("""
                Role: Refiner
                Goal: Improve and polish a rough idea into a well-articulated paragraph.
                Style: Clear and elegant.
                Context: You're improving a colleague's rough draft.
            """.trimIndent()),
            UserMessage("Please refine this idea:\n\n$rawIdea")
        ))
        val refinedOutput = chatClient.call(refinerPrompt).result.output.content

        return """
            🧠 Raw idea: $rawIdea
            
            ✨ Refined output: $refinedOutput
        """.trimIndent()
    }
}