package tests;

import creational_patterns.simplefactory.UserAccount;
import creational_patterns.simplefactory.UserAccountFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleFactoryTest {

    @Test
    void testCreateUserAccount() {
        UserAccount user = UserAccountFactory.createAccount("Admin");
        assertEquals("Admin", user.getRole());
    }
}
