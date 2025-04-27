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
 
  ## 🧪 Test Cases — Verifying CRUD Operations

The unit tests ensure that the `InMemoryUserAccountRepository` correctly handles **CRUD** operations as follows:

| Operation | Test Method | Description |
|-----------|-------------|-------------|
| **Create/Save** | `testSaveAndFindById()` | Saves a `UserAccount` entity and verifies it can be retrieved by ID. |
| **Read/Find** | `testSaveAndFindById()` | After saving, `findById()` successfully locates the correct entity. |
| **Read All** | `testFindAll()` | After saving multiple users, `findAll()` returns the full list of stored entities. |
| **Delete** | `testDelete()` | Deletes a user by ID and verifies that `findById()` no longer finds the user. |

---

### 🛠 JUnit 5 Test Coverage
- Tested **positive flows** (saving and retrieving existing users).
- Tested **negative flows** (retrieving after deletion to confirm it's missing).
- Used `Optional` to handle cases where the entity may or may not exist.

✅ These tests validate that the **In-Memory Repository** behaves correctly for all basic persistence operations.

✅ Ensures robustness before integrating real database storage in future development.

