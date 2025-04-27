package src.models;

import java.util.Date;

public class AnonymousReport {
    private String reportId;
    private String subject;
    private String description;
    private Date   submittedAt;
    private String status;

    public AnonymousReport(String reportId, String subject,
                           String description, Date submittedAt, String status) {
        this.reportId    = reportId;
        this.subject     = subject;
        this.description = description;
        this.submittedAt = submittedAt;
        this.status      = status;
    }

    /* Getters & setters */
    public String getReportId()                { return reportId; }
    public void   setReportId(String v)        { this.reportId = v; }

    public String getSubject()                 { return subject; }
    public void   setSubject(String v)         { this.subject = v; }

    public String getDescription()             { return description; }
    public void   setDescription(String v)     { this.description = v; }

    public Date   getSubmittedAt()             { return submittedAt; }
    public void   setSubmittedAt(Date v)       { this.submittedAt = v; }

    public String getStatus()                  { return status; }
    public void   setStatus(String v)          { this.status = v; }

    /* Domain stubs */
    public void submit()       {}
    public void validate()     {}
    public void notifyAdmin()  {}

    @Override
    public String toString() {
        return "AnonymousReport[" +
                "reportId="    + reportId    + ", " +
                "subject="     + subject     + ", " +
                "description=" + description + ", " +
                "submittedAt=" + submittedAt + ", " +
                "status="      + status      + "]";
    }
}

