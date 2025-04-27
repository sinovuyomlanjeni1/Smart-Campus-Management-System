package tests;

import creational_patterns.builder.MedicationRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class BuilderTest {

    @Test
    void testBuildMedicationRequest() {
        MedicationRequest request = new MedicationRequest.Builder()
            .setName("Painkillers")
            .setPickupDate(new Date())
            .build();
        assertNotNull(request);
    }
}
