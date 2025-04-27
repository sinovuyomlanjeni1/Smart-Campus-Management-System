package src.models;

import java.util.Date;

public class Appointment {
    private String appointmentId;
    private Date   date;
    private String time;
    private String status;
    private String practitioner;

    public Appointment(String appointmentId, Date date,
                       String time, String status, String practitioner) {
        this.appointmentId = appointmentId;
        this.date          = date;
        this.time          = time;
        this.status        = status;
        this.practitioner  = practitioner;
    }

    /* Getters & setters */
    public String getAppointmentId()               { return appointmentId; }
    public void   setAppointmentId(String v)       { this.appointmentId = v; }

    public Date   getDate()                        { return date; }
    public void   setDate(Date v)                  { this.date = v; }

    public String getTime()                        { return time; }
    public void   setTime(String v)                { this.time = v; }

    public String getStatus()                      { return status; }
    public void   setStatus(String v)              { this.status = v; }

    public String getPractitioner()                { return practitioner; }
    public void   setPractitioner(String v)        { this.practitioner = v; }

    /* Domain stubs */
    public void book()      {}
    public void cancel()    {}
    public void confirm()   {}
    public void complete()  {}

    @Override
    public String toString() {
        return "Appointment[" +
                "appointmentId=" + appointmentId + ", " +
                "date="          + date          + ", " +
                "time="          + time          + ", " +
                "status="        + status        + ", " +
                "practitioner="  + practitioner  + "]";
    }
}

