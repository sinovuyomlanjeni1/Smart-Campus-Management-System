# Reflection: Challenges in Translating Requirements to Use Cases and Test Cases

## 1. Understanding Stakeholder Needs
One of the biggest challenges was ensuring that the use cases accurately captured stakeholder expectations. While functional requirements were well-documented, interpreting how different user roles interact with the system required deeper analysis. For example, balancing **student usability** with **IT security concerns** led to adjustments in authentication flows.

## 2. Complexity in Defining Use Cases
Mapping system requirements to meaningful **use cases** was not straightforward. Some challenges included:
- Avoiding redundant use cases while covering all functionalities.
- Ensuring proper relationships between actors and use cases (e.g., inclusion and extension relationships).
- Keeping **alternative flows** realistic while covering unexpected user behavior.

## 3. Ensuring Comprehensive Test Cases
While defining **test cases**, challenges included:
- Ensuring test cases **directly mapped** to functional requirements.
- Identifying **realistic non-functional test scenarios** (e.g., performance under high loads, encryption validation).
- Defining clear **expected vs. actual results** to avoid ambiguity.

## 4. Balancing Security and Usability
A major trade-off was between **security and user convenience**. For example:
- **Students** wanted easy access to attendance tracking.
- **IT Staff** required **secure authentication (OAuth 2.0, AES-256 encryption)**.
- Finding a middle ground meant implementing **multi-factor authentication** but keeping session persistence for usability.

## 5. Lessons Learned
- **Iterative refinement is necessary**: Initial drafts of use cases and test cases needed revisions after stakeholder feedback.
- **Non-functional requirements are harder to validate**: Unlike functional requirements, performance/security tests required simulated environments.
- **Well-defined acceptance criteria help**: This made both use cases and test cases more measurable and actionable.

