
## 🧠 Reflection

### 🔍 Challenges in Choosing Granularity for States/Actions

One of the main challenges in designing state transition and activity diagrams is selecting the right **level of granularity**. Too much detail can overwhelm the reader and make diagrams cluttered, while too little can lead to oversimplification that omits critical behavior or logic. For instance, when designing the `MedicationRequest` diagram, deciding whether to represent intermediate states like *“Awaiting Pharmacist Approval”* versus just *“Requested”* required careful consideration of the system’s actual process flow and what information was essential for traceability.

To balance detail and readability:
- We focused on **user-impactful states** rather than every system nuance.
- We grouped actions or transitions that didn’t require visibility into a broader state.

---

### 🧩 Aligning Diagrams with Agile User Stories

Aligning diagrams with **Agile user stories** required ensuring that:
- Each state or activity had a **corresponding feature or behavior** described in a user story.
- Diagrams reflected **incremental development**—focusing on what’s “ready” or “done” in Agile terms.

For example, the `Submit Anonymous Report` activity was directly tied to *User Story US-007*, which outlines confidential reporting. Ensuring that the flow captures validations, error handling, and secure submission helped keep the diagram Agile-compliant and user-centric.

This alignment also helped prioritize which diagrams to build first based on high-value stories.

---

### 🔄 Comparing State Diagrams vs. Activity Diagrams

| Aspect                      | State Diagrams                              | Activity Diagrams                                |
|----------------------------|---------------------------------------------|--------------------------------------------------|
| **Focus**                  | Object **lifecycle and behavior over time** | **Process flow** or sequence of actions          |
| **Perspective**            | System/technical view                       | User/task-oriented view                          |
| **Best For**               | Tracking system response to events          | Visualizing user/system workflows                |
| **Example**                | `UserAccount` transitioning to `Suspended`  | Steps to `Book Appointment`                     |
| **Use in Agile**           | Helpful in technical design phase           | Useful in early planning and validation          |
| **Challenge**              | Managing complex state transitions          | Handling concurrent or optional paths            |

Both types of diagrams were valuable in different contexts. **State diagrams** helped define **how an object behaves**, while **activity diagrams** showed **how users interact with the system** step by step.

---
