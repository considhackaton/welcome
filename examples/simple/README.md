# First simple Agentic AI

# Agentic AI Demo – Spring AI + Ollama + Kotlin

This is a minimal Kotlin-based Spring Boot application that connects to a locally running Ollama LLM (e.g. llama3) using Spring AI.  
It serves as a foundation for experimenting with Agentic AI patterns, including the PEARL loop (Perceive → Evaluate → Act → Reflect → Learn).

## What It Does

- Connects to Ollama (llama3 model)
- Accepts a prompt via a simple REST endpoint
- Returns the generated response from the LLM
- Uses `application.yml` to configure the model (no manual overrides needed)

## Requirements

- Java 17+ and Kotlin
- Ollama installed locally: https://ollama.com/
- Ollama model pulled (e.g. `llama3`)

```
ollama pull llama3
ollama run llama3
```

## Running the App

1. Clone the repo and navigate to the project folder
2. Run the app using Gradle:

```
./gradlew bootRun
```

3. Test the endpoint:

```
curl "http://localhost:8080/chat?message=Hvad%20er%20Agentic%20AI%3F"
```

## Configuration (`application.yml`)

```
spring:
  ai:
    ollama:
      chat:
        options:
          model: llama3
      base-url: http://localhost:11434
```

## Code Example

```
@RestController
class ChatController(private val chatClient: ChatClient) {

    @GetMapping("/chat")
    fun chat(@RequestParam message: String): String {
        return chatClient.call(message)
    }
}
```

## Next Steps

- Add PEARL logic and structure (Perceive → Evaluate → Act → Reflect → Learn)
- Log prompts and responses for traceability
- Try advanced workflows using Spring AI chains, routing, or memory

## License

MIT – use freely, hack wildly.
