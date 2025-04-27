package tests;

import creational_patterns.prototype.EmergencyAlert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class PrototypeTest {

    @Test
    void testCloneEmergencyAlert() {
        EmergencyAlert original = new EmergencyAlert("Campus A", new Date());
        EmergencyAlert copy = original.clone();

        assertNotSame(original, copy);
        assertEquals(original.toString(), copy.toString());
    }
}
