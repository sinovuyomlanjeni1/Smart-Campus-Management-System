package creational_patterns.factorymethod;

public class DentistAppointmentFactory extends AppointmentFactory {
    @Override
    public Appointment createAppointment() {
        return new DentistAppointment();
    }
}

