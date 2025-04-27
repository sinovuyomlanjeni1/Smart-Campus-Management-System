package tests;

import creational_patterns.abstractfactory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void testAdminFactoryCreatesUserAndReport() {
        UserReportFactory factory = new AdminFactory();
        User user = factory.createUser();
        Report report = factory.createReport();

        assertNotNull(user);
        assertNotNull(report);
    }
}
