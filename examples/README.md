# 🤖 Agentic AI Demos – Spring AI + Ollama + Kotlin

This repo contains two simple yet powerful demonstrations of **Agentic AI patterns** built with **Spring Boot**, **Kotlin**, and **Ollama**:

- `simple`: A minimal example that sends a static message to an LLM
- `structured`: A more advanced agent that uses structured prompts (Role, Goal, Style, Context)

Agentic AI is about **giving AI agents a purpose, memory, and autonomy** — moving beyond passive chatbots. These demos are designed to help you understand and prototype that mindset.

---

## 💡 What Is Agentic AI?

Most AI assistants are passive responders — they wait for input and generate a reply with no memory, goals, or role identity.

**Agentic AI** is different:

- ✅ **Goal-oriented** – Agents operate with a purpose
- 🧠 **Context-aware** – They know who they're helping and why
- 🔁 **Reflective & adaptive** – Capable of improving over time
- 🧩 **Composable** – Can be chained, routed, and reused

Instead of sending raw questions to a generic assistant, you’ll learn how to:

- Wrap prompts in clear intentions and context
- Structure agent behavior using principles like **PEARL** and **MCP**
- Scale from simple demos to structured workflows

These demos give you a starting point for **designing such agents** — with just a few lines of Kotlin and Spring AI.


---

## 🌱 1. `simple/` – Minimal LLM Integration

A bare-bones Spring Boot application that uses Spring AI to send a static prompt to a locally running Ollama instance (`llama3`). It's ideal for verifying connectivity and starting experiments.

**Try it:**

```bash
curl http://localhost:8080/simple
```

---

## 🧱 2. `structured_prompt/` – Structured Prompt Agents

This project builds on the basics and wraps each request in a **structured prompt** that defines:

```
Role: Who is speaking?
Goal: What are they trying to achieve?
Style: How should they respond?
Context: What should they assume about the user?
```

This helps the model behave **consistently**, stay **in scope**, and allows you to **experiment with agent variations**.

**Try it:**

```bash
curl http://localhost:8080/structured-prompt/2 q
```

You’ll get an answer from a "Technical Solution Architect" agent.

---

## ⚙️ Requirements

- Java 17+
- Kotlin
- [Ollama](https://ollama.com)
- A local model (we use `llama3`)

```bash
ollama pull llama3
ollama run llama3
```

---

## 🚀 Running Either Demo

From either folder (`simple/` or `structured/`):

```bash
./gradlew bootRun
```


## 🔍 What's Next?

- Add memory and reflection (PEARL loop)
- Extend with RAG or API-calling agents
- Try chaining multiple roles for richer agent conversations

---

## 🪪 License

MIT – go build weird and useful things 🛠️
