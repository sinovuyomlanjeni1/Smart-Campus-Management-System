package src.models;

import java.util.Date;

public class AttendanceRecord {
    private String recordId;
    private Date   date;
    private String status;
    private String notes;

    public AttendanceRecord(String recordId, Date date,
                            String status, String notes) {
        this.recordId = recordId;
        this.date     = date;
        this.status   = status;
        this.notes    = notes;
    }

    /* Getters & setters */
    public String getRecordId()            { return recordId; }
    public void   setRecordId(String v)    { this.recordId = v; }

    public Date   getDate()                { return date; }
    public void   setDate(Date v)          { this.date = v; }

    public String getStatus()              { return status; }
    public void   setStatus(String v)      { this.status = v; }

    public String getNotes()               { return notes; }
    public void   setNotes(String v)       { this.notes = v; }

    /* Domain stubs */
    public void markAttendance()  {}
    public void generateReport()  {}

    @Override
    public String toString() {
        return "AttendanceRecord[" +
                "recordId=" + recordId + ", " +
                "date="     + date     + ", " +
                "status="   + status   + ", " +
                "notes="    + notes    + "]";
    }
}

