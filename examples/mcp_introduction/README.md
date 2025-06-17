# 🟢 `simple/` – Minimal Agentic AI with Spring AI

This is the most basic possible Spring Boot + Kotlin app that connects to a local Ollama model (like `llama3`) using Spring AI.

Perfect for:
- Verifying your setup
- Testing model output
- Bootstrapping LLM integration

---

## 💡 What It Does

- Uses Spring AI's `ChatClient`
- Sends a fixed question
- Returns a simple string response

---

## 🚀 How to Run

Make sure Ollama is running:

```bash
ollama run llama3
```

Then run the app:

```bash
./gradlew bootRun
```

Test the endpoint:

```bash
curl http://localhost:8080/simple
```

---

## 📄 Code Snippet

```kotlin
@RestController
class ChatController(private val chatClient: ChatClient) {

    @GetMapping("/simple")
    fun chat(): String {
        val message = "What is Agentic AI, and how is it different from regular AI assistants?"
        return chatClient.call(message)
    }
}
```

---

## 🧩 What's Next?

- Add dynamic user input
- Log inputs and outputs
- Introduce roles and PEARL loops

---
