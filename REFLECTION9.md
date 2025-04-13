# 🧠 Reflection on Domain Modeling & Class Diagram Design

Designing the domain model and class diagram for this system was both insightful and challenging. It required me to apply object-oriented thinking while staying grounded in the real-world use cases and functional requirements defined in previous assignments. Here's a breakdown of the key challenges, design choices, and lessons learned throughout the process.

---

### 🔍 Challenges in Designing the Domain Model

The biggest challenge during domain modeling was determining the **right level of abstraction**. For example, I initially debated whether to include separate entities for clinics and pharmacists or treat them as roles associated with appointments and medication approvals. To keep the domain clean and focused on user-driven interactions, I chose to abstract system-side actions into **attributes** or **methods** within objects like `MedicationRequest` and `Appointment`.

Another challenge was **mapping real-world processes into entities and relationships**. For instance, in real life, missing a medication pickup could involve follow-up from multiple roles (nurses, system alerts, etc.). In the model, I simplified this into a `sendReminder()` method inside the `MedicationRequest` class, triggered when the `pickupTime` is missed.

I also had to be careful to **not over-model** every detail. The goal was clarity and extensibility, not completeness for its own sake.

---

### 🔄 Aligning with Previous Assignments

The class diagram aligns closely with prior deliverables:

- **Use Cases (Assignment 5):** The methods in classes like `UserAccount`, `Appointment`, and `AnonymousReport` reflect user actions like registering, booking, and reporting.
- **State & Activity Diagrams (Assignment 8):** Object behaviors like `markCollected()` and `submit()` were derived directly from workflows and transitions defined in state/activity models.
- **Functional Requirements (Assignment 4):** Each class maps to a major system feature, ensuring consistency with what the system is expected to do.

The traceability across artifacts created a sense of continuity in the design. Every class served a real purpose backed by documented behavior.

---

### ⚖️ Trade-offs and Design Decisions

Several trade-offs were made:

- I chose **composition over inheritance** to keep the model lean and more intuitive. For example, `AnonymousReport` and `EmergencyAlert` are separate classes rather than being specialized alert types. This decision reduced diagram complexity while preserving clarity.
- I excluded system-level entities like `ClinicSystem` from the diagram to keep the focus on **user-facing features**, although these could be modeled in future iterations.
- I opted to **group related actions into class methods**, even if they might be implemented across microservices in practice (e.g., `validate()` and `notifyAdmin()` both live in `AnonymousReport`).

---

### 📚 Lessons Learned

This assignment reinforced the importance of **domain-driven design (DDD)** and how it creates a shared understanding of the system’s structure. Modeling the domain forced me to think carefully about **ownership of data**, **lifecycles of objects**, and **how behavior maps to structure**.

I also gained practical experience in using **Mermaid.js for class diagrams**, which is both readable and GitHub-friendly. It’s a great lightweight tool for keeping diagrams version-controlled alongside source code.

Perhaps most importantly, I learned that good domain models don’t just mirror the database—they reflect **business logic**, **user interactions**, and **system rules** in a cohesive and understandable way.
