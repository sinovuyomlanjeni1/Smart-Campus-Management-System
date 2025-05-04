package repositories.inmemory;


import models.UserAccount;
import repositories.inmemory.InMemoryUserAccountRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryUserAccountRepositoryTest {

    @Test
    void testSaveAndFindById() {
        InMemoryUserAccountRepository repo = new InMemoryUserAccountRepository();
        UserAccount user = new UserAccount("1", "John Doe", "john@example.com", "1234567890", "ACTIVE");
        repo.save(user);

        Optional<UserAccount> retrieved = repo.findById("1");
        assertTrue(retrieved.isPresent());
        assertEquals("John Doe", retrieved.get().getName());
    }

    @Test
    void testFindAll() {
        InMemoryUserAccountRepository repo = new InMemoryUserAccountRepository();
        repo.save(new UserAccount("1", "Alice", "alice@example.com", "5555", "ACTIVE"));
        repo.save(new UserAccount("2", "Bob", "bob@example.com", "6666", "ACTIVE"));

        assertEquals(2, repo.findAll().size());
    }

    @Test
    void testDelete() {
        InMemoryUserAccountRepository repo = new InMemoryUserAccountRepository();
        repo.save(new UserAccount("3", "Charlie", "charlie@example.com", "7777", "ACTIVE"));
        repo.delete("3");

        Optional<UserAccount> retrieved = repo.findById("3");
        assertFalse(retrieved.isPresent());
    }
}

