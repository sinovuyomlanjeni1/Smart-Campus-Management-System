## 🛡️ Justification

- **Use of Generics in Repository Interface:**
  - Implemented a generic `Repository<T, ID>` interface to avoid duplication of CRUD methods across different entity repositories (e.g., `UserAccountRepository`, `MedicationRequestRepository`, etc.).
  - This ensures **reusability**, **type safety**, and **consistency** in how different objects are stored, retrieved, and managed.

- **Entity-Specific Repository Interfaces:**
  - Created interfaces like `UserAccountRepository` to **specialize** the generic repository for each domain entity.
  - This approach follows the **Interface Segregation Principle (ISP)** by keeping interfaces focused and minimal.

- **Advantages of This Design:**
  - Easy to add new repositories for new models (e.g., `AppointmentRepository`) without rewriting CRUD logic.
  - Clear contract for operations on different entities.
  - Encourages **DRY** (Don't Repeat Yourself) coding practices across persistence layers.
