# 🤝 Agentic AI Demo – Agent2Agent Pattern

This project demonstrates a simple yet powerful **Agent-to-Agent (A2A)** interaction pattern using Spring AI and Kotlin.  
Instead of one agent answering a user question, **two agents collaborate** — where one generates an idea and the other refines it.

---

## 🧠 What is Agent2Agent?

Agent2Agent is a design pattern where agents **communicate**, **collaborate**, and **build on each other’s outputs**.

At its core, it's just:
> One agent's output becomes another agent's input.

This enables:
- **Specialized roles** (e.g., Generator + Refiner)
- **Modular design** (easy to swap or extend agents)
- **Better output quality** through iterative processing

---

## 🔁 How It Works

1. **Idea Generator Agent**
    - Gets a user topic
    - Produces a raw idea (e.g., summary, concept)

2. **Refiner Agent**
    - Takes the raw idea
    - Improves it in tone, structure, or clarity

Each agent has a defined:
- **Role**
- **Goal**
- **Style**
- **Context**


---

## 🧪 Example Endpoint

```
GET /a2a?topic=Agentic%20AI%20in%20Healthcare
```

Returns something like:

```
🧠 Raw idea: Use agentic AI to help clinicians reflect on treatment options through simulated dialogue.

✨ Refined output: An agentic AI system could support clinicians by simulating reflective discussions, enabling better-informed decisions in complex medical cases.
```

---

## 🚀 Running the App

1. Pull and run Ollama:

```bash
ollama pull llama3
ollama run llama3
```

2. Run Spring Boot:

```bash
./gradlew bootRun
```

3. Try it:

```bash
curl "http://localhost:8080/a2a?topic=Agentic%20AI%20in%20education"
```

---

## 📁 Structure

- `Agent2AgentController.kt` – main logic (2 agents chained)
- Uses `Prompt`, `SystemMessage`, `UserMessage`
- No external memory or planning needed – pure chaining

---

## 💡 Next Steps

- Add a third "Validator" agent
- Use this pattern in RAG or task delegation
- Store agent outputs in a knowledge base

---

## License

MIT – fork, hack, remix!
