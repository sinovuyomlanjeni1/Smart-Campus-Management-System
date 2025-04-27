## 🛠️ Dependency Management Choice: Factory Pattern over Dependency Injection (DI)

- **Reason for Choosing Factory Pattern:**
  - **Project Simplicity:**  
    The project is relatively small and only requires switching between a limited number of repository implementations (e.g., `InMemory` vs `Database`).
    Using a **Factory** provides a simple, centralized way to control object creation without adding the complexity of Dependency Injection frameworks like Spring.

  - **Manual Control:**  
    The **Factory Pattern** allows fine-grained manual control over **which repository implementation** is instantiated based on a simple input (e.g., `"MEMORY"` or `"DATABASE"`).
  
  - **Low Overhead:**  
    No need to introduce heavy configuration files, annotations (`@Autowired`), or external containers for a lightweight assignment.

- **How It Works:**
  - `RepositoryFactory` exposes methods like `getUserAccountRepository(String storageType)`.
  - Depending on the `storageType`, the factory decides whether to return:
    - `InMemoryUserAccountRepository`
    - or (future) `DatabaseUserAccountRepository`
  - Client classes **do not need to know** the exact repository class — only the interface.

---

### ✨ Future Considerations:
- For **larger real-world projects** with hundreds of repositories and services, using a **Dependency Injection framework (e.g., Spring)** would be preferred.
- **DI** automatically manages dependencies, reduces boilerplate, and improves scalability.

