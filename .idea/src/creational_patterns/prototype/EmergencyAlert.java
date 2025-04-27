package creational_patterns.prototype;

import java.util.Date;

public class EmergencyAlert implements Cloneable {
    private String location;
    private Date timeSent;

    public EmergencyAlert(String location, Date timeSent) {
        this.location = location;
        this.timeSent = timeSent;
    }

    public EmergencyAlert clone() {
        return new EmergencyAlert(location, new Date(timeSent.getTime()));
    }

    @Override
    public String toString() {
        return "EmergencyAlert{" +
                "location='" + location + '\'' +
                ", timeSent=" + timeSent +
                '}';
    }
}
