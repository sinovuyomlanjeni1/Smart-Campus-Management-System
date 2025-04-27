package creational_patterns.factorymethod;

public class DoctorAppointmentFactory extends AppointmentFactory {
    @Override
    public Appointment createAppointment() {
        return new DoctorAppointment();
    }
}

