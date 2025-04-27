package creational_patterns.builder;

import java.util.Date;

public class MedicationRequest {
    private String name;
    private Date pickupDate;

    private MedicationRequest(Builder builder) {
        this.name = builder.name;
        this.pickupDate = builder.pickupDate;
    }

    public static class Builder {
        private String name;
        private Date pickupDate;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPickupDate(Date pickupDate) {
            this.pickupDate = pickupDate;
            return this;
        }

        public MedicationRequest build() {
            return new MedicationRequest(this);
        }
    }

    @Override
    public String toString() {
        return "MedicationRequest{" +
                "name='" + name + '\'' +
                ", pickupDate=" + pickupDate +
                '}';
    }
}