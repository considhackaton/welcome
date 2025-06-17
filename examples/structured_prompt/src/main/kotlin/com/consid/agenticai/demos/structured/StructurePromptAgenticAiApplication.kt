package com.consid.agenticai.demos.structured

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.ai.chat.ChatClient
import org.springframework.ai.chat.messages.SystemMessage
import org.springframework.ai.chat.messages.UserMessage
import org.springframework.ai.chat.prompt.Prompt
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
@SpringBootApplication
class StructurePromptAgenticAiApplication

fun main(args: Array<String>) {
    runApplication<StructurePromptAgenticAiApplication>(*args)
}



@RestController
class StructuredPromptController(private val chatClient: ChatClient) {
    fun extractRole(prompt: String): String {
        val match = Regex("""Role:\s*(.+)""").find(prompt)
        return match?.groupValues?.get(1)?.trim() ?: "Unknown"
    }
    fun prompt(
        role: String,
        goal: String,
        style: String,
        context: String
    ): String = """
    Role: $role
    Goal: $goal
    Style: $style
    Context: $context
""".trimIndent()

    @GetMapping("/structured-prompt/{id}")
    fun structuredPromptChat(@PathVariable id: Int):String {
        val message = "What is Agentic AI, and how is it different from regular AI assistants?"

        val prompts = listOf(
            //0
            prompt(
                role = "Patient Instructor",
                goal = "Explain complex technical topics to non-experts",
                style = "Clear, step-by-step, and friendly",
                context = "The user is curious about Agentic AI but doesn't have a technical background"
            ),
            //1
            prompt(
                role = "Strategic Business Advisor",
                goal = "Identify potential business value and risks in emerging AI technologies",
                style = "Concise, executive-friendly",
                context = "The user is evaluating use cases for AI in a mid-sized company"
            ),
            //2
            prompt(
                role = "Technical Solution Architect",
                goal = "Explain how Agentic AI can be implemented in software systems",
                style = "Precise, code-aware",
                context = "The user is building a Spring AI app with autonomous capabilities"
            ),
            //3
            prompt(
                role = "AI Ethics Advisor",
                goal = "Analyze implications and risks of autonomous AI behavior",
                style = "Reflective and analytical",
                context = "The user is considering deploying agentic features in customer-facing apps"
            ),
            //4
            prompt(
                role = "Creative Storyteller",
                goal = "Make technical concepts fun and engaging through analogies or stories",
                style = "Playful and imaginative",
                context = "The user is exploring the world of AI and innovation"
            ),
            //5
            prompt(
                role = "Impatient husband",
                goal = "Try to explain your wife who is not technical at least what Agentic AI is",
                style = "Impatient and a bit condensing",
                context = "The user doesn't really wanna know, but thinks she needs to ask her husband what he is doing."
            )
        )
        val prompt = prompts[id]
        val system = SystemMessage(prompt)
        val user = UserMessage(message)

        val request = Prompt(listOf(system, user))
        val response = chatClient.call(request)
        val role = extractRole(prompt)
        val content = response.result.output.content
        return """
            Role: $role.
            $content
        """.trimIndent()
    }
}