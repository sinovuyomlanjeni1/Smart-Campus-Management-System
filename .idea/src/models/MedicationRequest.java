package src.models;

import java.util.Date;

public class MedicationRequest {
    private String requestId;
    private String medicationName;
    private String status;
    private String approvedBy;
    private Date   pickupTime;

    public MedicationRequest(String requestId, String medicationName,
                             String status, String approvedBy, Date pickupTime) {
        this.requestId      = requestId;
        this.medicationName = medicationName;
        this.status         = status;
        this.approvedBy     = approvedBy;
        this.pickupTime     = pickupTime;
    }

    /* Getters & setters */
    public String getRequestId()               { return requestId; }
    public void   setRequestId(String v)       { this.requestId = v; }

    public String getMedicationName()          { return medicationName; }
    public void   setMedicationName(String v)  { this.medicationName = v; }

    public String getStatus()                  { return status; }
    public void   setStatus(String v)          { this.status = v; }

    public String getApprovedBy()              { return approvedBy; }
    public void   setApprovedBy(String v)      { this.approvedBy = v; }

    public Date   getPickupTime()              { return pickupTime; }
    public void   setPickupTime(Date v)        { this.pickupTime = v; }

    /* Domain stubs */
    public void request()        {}
    public void approve()        {}
    public void markCollected()  {}
    public void sendReminder()   {}

    @Override
    public String toString() {
        return "MedicationRequest[" +
                "requestId="      + requestId      + ", " +
                "medicationName=" + medicationName + ", " +
                "status="         + status         + ", " +
                "approvedBy="     + approvedBy     + ", " +
                "pickupTime="     + pickupTime     + "]";
    }
}

