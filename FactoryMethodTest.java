package tests;

import creational_patterns.factorymethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void testDoctorAppointmentBooking() {
        AppointmentFactory factory = new DoctorAppointmentFactory();
        Appointment appointment = factory.createAppointment();
        assertNotNull(appointment);
    }

    @Test
    void testDentistAppointmentBooking() {
        AppointmentFactory factory = new DentistAppointmentFactory();
        Appointment appointment = factory.createAppointment();
        assertNotNull(appointment);
    }
}
