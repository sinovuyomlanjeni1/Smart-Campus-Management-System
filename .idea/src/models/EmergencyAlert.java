package src.models;

import java.util.Date;

public class EmergencyAlert {
    private String alertId;
    private String location;
    private Date   timeSent;
    private String status;

    public EmergencyAlert(String alertId, String location,
                          Date timeSent, String status) {
        this.alertId  = alertId;
        this.location = location;
        this.timeSent = timeSent;
        this.status   = status;
    }

    /* Getters & setters */
    public String getAlertId()              { return alertId; }
    public void   setAlertId(String v)      { this.alertId = v; }

    public String getLocation()             { return location; }
    public void   setLocation(String v)     { this.location = v; }

    public Date   getTimeSent()             { return timeSent; }
    public void   setTimeSent(Date v)       { this.timeSent = v; }

    public String getStatus()               { return status; }
    public void   setStatus(String v)       { this.status = v; }

    /* Domain stubs */
    public void trigger()      {}
    public void acknowledge()  {}
    public void resolve()      {}
    public void escalate()     {}

    @Override
    public String toString() {
        return "EmergencyAlert[" +
                "alertId="  + alertId  + ", " +
                "location=" + location + ", " +
                "timeSent=" + timeSent + ", " +
                "status="   + status   + "]";
    }
}
