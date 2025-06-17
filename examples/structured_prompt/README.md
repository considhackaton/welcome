# 🧱 Agentic AI – Structured Prompt Demo

This project demonstrates how to build a **structured agent** using Spring AI and Kotlin — where each agent follows a clearly defined **role**, **goal**, **style**, and **context**.

Instead of just throwing arbitrary messages at the LLM, this demo explores a cleaner and more modular approach inspired by **Model Context Protocol (MCP)** and **agentic design principles**.

---

## 📌 Why Structured Prompts?

In many LLM-based systems, you just throw a question into a generic assistant and hope for the best.

This demo does something different: it **wraps the agent in identity and purpose**.

Each request is constructed with a structured prompt like:

```
Role: Patient Instructor  
Goal: Explain complex topics to non-experts  
Style: Friendly and clear  
Context: User is new to Agentic AI
```

This gives the model a **consistent personality** and **limits scope creep**.

It also allows you to:

- Swap between agent personas easily
- Reuse structured behavior
- Log or audit prompt configurations
- Chain agents together with clear hand-offs

---

## 🚀 How to Run

1. Make sure you have [Ollama](https://ollama.com) running locally (with a model like `llama3` downloaded):

   ```bash
   ollama run llama3
   ```

2. Run the Spring Boot app:

   ```bash
   ./gradlew bootRun
   ```

3. Visit this endpoint in your browser or with curl:

   ```
   http://localhost:8080/structured-prompt/0
   ```

   This sends a standard question:
   ```
   What is Agentic AI, and how is it different from regular AI assistants?
   ```

   …to an agent defined by the selected index (e.g. index 0 = "Patient Instructor").

---

## 🧪 Available Agents

| ID | Role                     | Goal                                                      |
|----|--------------------------|------------------------------------------------------------|
| 0  | Patient Instructor        | Explain concepts clearly to non-experts                   |
| 1  | Strategic Business Advisor| Discuss business value and risks                          |
| 2  | Technical Solution Architect | Dive into implementation of Agentic AI                  |
| 3  | AI Ethics Advisor        | Reflect on implications and risks                         |
| 4  | Creative Storyteller     | Make concepts fun and easy to grasp                      |
| 5  | Impatient Husband 🧪      | Explain reluctantly to someone who didn't really ask 😉    |

Try calling:

```bash
curl http://localhost:8080/structured-prompt/1
```
