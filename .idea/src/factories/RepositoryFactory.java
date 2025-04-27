package factories;

import repositories.UserAccountRepository;
import repositories.inmemory.InMemoryUserAccountRepository;
// Future: import repositories.database.DatabaseUserAccountRepository;

public class RepositoryFactory {

    public static UserAccountRepository getUserAccountRepository(String storageType) {
        switch (storageType.toUpperCase()) {
            case "MEMORY":
                return new InMemoryUserAccountRepository();
            case "DATABASE":
                // return new DatabaseUserAccountRepository(); // Future-proofed
                throw new UnsupportedOperationException("Database not implemented yet.");
            default:
                throw new IllegalArgumentException("Invalid storage type: " + storageType);
        }
    }
}
