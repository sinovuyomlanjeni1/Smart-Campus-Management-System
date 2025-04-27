package tests.repositories.inmemory;

import models.UserAccount;
import repositories.inmemory.InMemoryUserAccountRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertTrue;
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
    void testDelete() {
        InMemoryUserAccountRepository repo = new InMemoryUserAccountRepository();
        UserAccount user = new UserAccount("2", "Jane Doe", "jane@example.com", "0987654321", "ACTIVE");
        repo.save(user);
        repo.delete("2");

        Optional<UserAccount> retrieved = repo.findById("2");
        assertFalse(retrieved.isPresent());
    }
}