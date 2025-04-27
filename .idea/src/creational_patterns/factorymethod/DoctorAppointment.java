package creational_patterns.factorymethod;

public class DoctorAppointment implements Appointment {
    @Override
    public void book() {
        System.out.println("Doctor appointment booked.");
    }
}
