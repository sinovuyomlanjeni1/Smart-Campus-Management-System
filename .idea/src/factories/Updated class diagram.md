## 📈 Updated Class Diagram — Persistence Layer
✅ This diagram shows:
- `Repository<T, ID>` is the **generic base interface**.
- `UserAccountRepository` **specializes** it.
- `InMemoryUserAccountRepository` and `DatabaseUserAccountRepository` **implement** the specialized repository.
- `RepositoryFactory` **returns** the correct repository type depending on the storage type.

---

```mermaid
classDiagram
    class Repository~T, ID~ {
        +save(T entity)
        +findById(ID id)
        +findAll()
        +delete(ID id)
    }

    Repository <|-- UserAccountRepository

    class UserAccountRepository {
        <<interface>>
    }

    UserAccountRepository <|.. InMemoryUserAccountRepository
    UserAccountRepository <|.. DatabaseUserAccountRepository

    class InMemoryUserAccountRepository {
        -Map<String, UserAccount> storage
        +save(UserAccount entity)
        +findById(String id)
        +findAll()
        +delete(String id)
    }

    class DatabaseUserAccountRepository {
        +save(UserAccount entity)
        +findById(String id)
        +findAll()
        +delete(String id)
    }

    class RepositoryFactory {
        +static UserAccountRepository getUserAccountRepository(String storageType)
    }

    RepositoryFactory --> UserAccountRepository

