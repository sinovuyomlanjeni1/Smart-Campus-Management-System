package creational_patterns.prototype;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmergencyAlert original = new EmergencyAlert("Clinic A", new Date());
        EmergencyAlert copy = original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone: " + copy);
    }
}