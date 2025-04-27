package creational_patterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        AppointmentFactory doctorFactory = new DoctorAppointmentFactory();
        Appointment doctor = doctorFactory.createAppointment();
        doctor.book();

        AppointmentFactory dentistFactory = new DentistAppointmentFactory();
        Appointment dentist = dentistFactory.createAppointment();
        dentist.book();
    }
}

