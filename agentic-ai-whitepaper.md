# Agentic AI – En Ny Epoke for Menneske-AI Samspil

## 1. Introduktion og kontekst

Agentic AI handler om at skabe **aktive, selvkørende AI’er**, som ikke bare svarer på spørgsmål, men **tager initiativ, løser opgaver og arbejder sammen med mennesker** over tid.

I modsætning til klassisk AI, der ofte reagerer på én ting ad gangen, kan agentiske systemer:
- forstå deres opgave,
- vælge handlinger,
- bruge værktøjer og data,
- og tilpasse sig undervejs.

Denne type AI åbner for helt nye måder at arbejde og bygge løsninger på – fra automatiske sagsbehandlere og DevOps-agenter til personlige assistenter og teammedlemmer.

### Hvorfor dette white paper?

Dette dokument er skabt som en fælles **introduktion og guide** til vores hackathon om Agentic AI. Det giver:
- Et overblik over centrale begreber
- Eksempler og mønstre man kan bygge ud fra
- Inspiration til både no-code og udviklingsprojekter

Uanset om du koder, sælger, designer eller rådgiver, er der plads til at udforske agentiske idéer og løsninger.

---

## 2. Arketyper og brugsscenarier

Agentiske AI’er kan tage mange former – fra simple hjælpere til komplekse samarbejdspartnere. Her er fire typiske roller, som agenter kan spille:

### Personlige agenter
- En skriveassistent, der foreslår forbedringer og retter tonen.  
- En læringsagent, der følger dine fremskridt og foreslår næste emne.

### Forretningsagenter
- En e-mail-agent, der prioriterer henvendelser og foreslår svar.  
- En HR-agent, der guider nye medarbejdere gennem onboarding.

### Tekniske agenter
- En DevOps-agent, der overvåger systemer og foreslår handlinger.  
- En QA-agent, der gennemgår kode og tester funktionalitet automatisk.

### Tværgående agenter
- En projektagent, der deler opgaver og følger op på status.  
- En moderator-agent, der samler input og hjælper med beslutninger.

---

## 3. Teknologisk fundament

### Store sprogmodeller (LLMs)
**GPT-4, Claude 3, Gemini, Mistral** udgør agentens kerne og gør det muligt at forstå, analysere og generere sprog og kode.

### Tool use
Agenter anvender værktøjer som API’er, databaser og kodeeksekvering til at handle i omgivelserne.

### Memory og state
Hukommelse kan være kortvarig (session) eller langtid (vektorbaseret). Den gør det muligt for agenter at lære og tilpasse sig.

### Prompts og instruktioner
Prompts definerer rolle, adfærd og mål – og styrer agentens output og værktøjsbrug.

---

## 4. Udvalgte tilgange og protokoller

### Retrieval-Augmented Generation (RAG)
Kobler agenten til dokument- eller datakilder, så den kan hente og bruge information i realtid.

### Model Context Protocol (MCP)
En struktur for at dele roller, mål og kontekst mellem agenter – særligt nyttigt i multi-agent arkitektur.

### agent2agent
En protokol for social og samarbejdende kommunikation mellem agenter, fx i dialog eller koordinering.

---

## 5. Agentens operationelle cyklus: PEARL

1. **Perceive** – Registrerer input og signaler fra omgivelserne  
2. **Evaluate** – Analysér, forstå og planlæg næste skridt  
3. **Act** – Udfør en handling, fx kald API eller generér output  
4. **Reflect** – Vurder resultatet og lær af det  
5. **Learn** – Tilpas strategi og opdater hukommelse

---

## 6. Agentiske designmønstre (Anthropic)

| Mønster               | Beskrivelse                              | Brugsscenarie                    |
|-----------------------|-------------------------------------------|----------------------------------|
| Prompt Chaining       | Trinvise prompts                          | Opgaveløsning i flere trin       |
| Routing               | Sender opgaver til specialiserede agenter | Klassificering, triagering       |
| Parallelization       | Flere agenter arbejder samtidig           | Brainstorming, voting            |
| Orchestrator–Worker   | Central agent styrer delagenter           | Projektstyring, koordination     |
| Evaluator–Optimizer   | Feedback-loop mellem generation og vurdering | Kvalitetssikring              |
| Autonomous Agents     | Agenter der sætter mål og handler selv     | Langvarige opgaver               |

---

## 7. Anvendelse i praksis – Hackathon fokus

### No-code sporet (Copilot Studio)

| Idé                      | Beskrivelse                                                  |
|--------------------------|--------------------------------------------------------------|
| E-mail agent             | Foreslår svar og prioriterer e-mails                         |
| Emneovervåger med resumé | Overvåger udvalgte emner på nettet og leverer dagligt resumé |
| Onboarding-agent         | Hjælper nye medarbejdere med at finde rundt og stille spørgsmål |
| Daglig opsummering       | Samler noter og møder og genererer statusrapport             |
| Tilmeldingsagent         | Håndterer tilmelding og udsender bekræftelser og påmindelser |

### Udviklingssporet (.NET / Java / Spring)

| Idé                      | Beskrivelse                                                  |
|--------------------------|--------------------------------------------------------------|
| Tilbudsagent             | Genererer tilbud ud fra behovsbeskrivelse og tidligere skabeloner |
| Projektstatus-agent      | Opsummerer fremdrift, status og risici fra projektdata       |
| Konsulenttilbuds-agent   | Matcher forespørgsel med konsulenter og udarbejder udkast    |

### Evalueringskriterier

- Har agenten et mål?
- Handler den selvstændigt?
- Bruger den værktøjer og data?
- Lærer den af feedback?
- Kan den samarbejde med andre?

---

## 8. Kilder og videre læsning

Se: (./sources-and-resources.md)

---

## 📎 Bilag A – Begreber, prompts og arkitektur

### A.1 Nøglebegreber

| Begreb     | Forklaring                              |
|------------|------------------------------------------|
| Agentisk AI| Målstyret, selvkørende og adaptiv AI     |
| LLM        | Stor sprogmodel                         |
| Tool use   | Brug af værktøjer/API                   |
| Memory     | Kort- og langtidshukommelse             |
| RAG        | Søgning i datakilder før generationsoutput |
| PEARL      | Perceive–Evaluate–Act–Reflect–Learn     |
| MCP        | Deling af rolle og kontekst             |
| Prompt     | Tekstlig instruktion der styrer adfærd  |

---

### A.2 Promptskabeloner

````markdown
```txt
Du er en [rolle], som skal hjælpe med at [opgave].
Du må gerne bruge værktøjer til at løse opgaven.
Svar klart og trinvis.
Hvis du er i tvivl, så spørg eller foreslå alternativer.
Her er opgaven: “[brugerinput]”.
Lav en trinvis plan med 3–5 punkter, som kan løse opgaven effektivt.
````
---

### A.3 Arkitekturdiagrammer (tekstskitser)

````markdown
```txt
Single-agent:
[User] → [Agent] → [RAG DB + Tools] → [Output]

Orchestrator–Worker:
[Orchestrator Agent]
  → [Planner]
  → [Executor]
  → [Critic]

agent2agent:
[Agent A] ↔ [Agent B] ↔ [Agent C]
(Rolle og kontekst via MCP)
```
