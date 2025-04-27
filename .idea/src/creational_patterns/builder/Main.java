package creational_patterns.builder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MedicationRequest request = new MedicationRequest.Builder()
                .setName("Painkillers")
                .setPickupDate(new Date())
                .build();

        System.out.println(request);
    }
}
