package tests;

import creational_patterns.singleton.SystemLogger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void testLoggerIsSingleton() {
        SystemLogger logger1 = SystemLogger.getInstance();
        SystemLogger logger2 = SystemLogger.getInstance();

        assertSame(logger1, logger2);
    }
}
