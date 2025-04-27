package creational_patterns.factorymethod;

public class DentistAppointment implements Appointment {

    @Override
    public void book() {
        System.out.println("Dentist appointment booked.");
    }
}
