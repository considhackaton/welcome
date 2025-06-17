# 🧱 `structured/` – Structured Prompts & Agent Personas

This demo expands on the simple project by introducing a more **agentic and modular approach** to prompting.

Instead of sending a free-form message to the LLM, each agent is defined using a consistent schema:

- **Role** – Who is speaking? (e.g., Instructor, Architect, Business Advisor)
- **Goal** – What are they trying to achieve?
- **Style** – How should the response be phrased?
- **Context** – What should the agent assume about the user?

This approach is inspired by principles like the **Model Context Protocol (MCP)** and general best practices from the Agentic AI community.

---

## 🎯 Why Structured Prompts?

Traditional prompts can quickly become brittle and hard to reuse.

With structured prompts, your agents become:

- ✅ **Predictable** – Clear behavior and scope
- 🔄 **Composable** – Easy to combine in chains or switch between roles
- 🧪 **Testable** – Individual agent configurations can be reused across scenarios
- 👥 **Human-like** – Agents behave with identity and purpose

This structure is also a stepping stone toward **autonomous agents** that reason, reflect, and improve.

---

## 🧪 Example

```bash
curl http://localhost:8080/structured-prompt/2
```

Returns a response from:

```
Role: Technical Solution Architect
Goal: Explain implementation
Style: Precise and code-aware
Context: Spring AI developer
```

---

---

## 🤖 How It Works

Each `/structured-prompt/{id}` call uses a different persona (e.g., Instructor, Business Advisor, etc.)

---

## 🧪 Example

```bash
curl http://localhost:8080/structured-prompt/2
```

Returns a response from:

```
Role: Technical Solution Architect
Goal: Explain implementation
Style: Precise and code-aware
Context: Spring AI developer
```

---

## 🧠 Why Structured Prompts?

- Easier to test personas
- Promotes separation of concerns
- Works well with chaining & memory

---

## ✨ Try These Personas

| ID | Role                     | Goal                                |
|----|--------------------------|-------------------------------------|
| 0  | Patient Instructor        | Teach in plain language             |
| 1  | Strategic Business Advisor| Identify value and risks            |
| 2  | Technical Architect       | Guide software implementation       |
| 3  | Ethics Advisor            | Analyze ethical implications        |
| 4  | Creative Storyteller      | Explain with fun analogies          |
| 5  | Impatient Husband (fun)   | Grumpy explanation                  |

---

## 🔧 Setup

Use the same setup as in `/simple`:

```bash
ollama pull llama3
ollama run llama3
./gradlew bootRun
```

---

## 🪪 License

MIT – build something agentic 🚀
