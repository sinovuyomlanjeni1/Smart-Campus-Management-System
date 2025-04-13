# 🧱 Class Diagram (Mermaid.js)

The following Mermaid.js class diagram illustrates the structural design of the system, including key classes, their attributes, methods, and relationships.

```mermaid
classDiagram
    class UserAccount {
        -userId: String
        -name: String
        -email: String
        -phone: String
        -status: String
        +register()
        +login()
        +deactivate()
        +appeal()
    }

    class MedicationRequest {
        -requestId: String
        -medicationName: String
        -status: String
        -approvedBy: String
        -pickupTime: Date
        +request()
        +approve()
        +markCollected()
        +sendReminder()
    }

    class Appointment {
        -appointmentId: String
        -date: Date
        -time: String
        -status: String
        -practitioner: String
        +book()
        +cancel()
        +confirm()
        +complete()
    }

    class EmergencyAlert {
        -alertId: String
        -location: String
        -timeSent: Date
        -status: String
        +trigger()
        +acknowledge()
        +resolve()
        +escalate()
    }

    class AnonymousReport {
        -reportId: String
        -subject: String
        -description: String
        -submittedAt: Date
        -status: String
        +submit()
        +validate()
        +notifyAdmin()
    }

    class AttendanceRecord {
        -recordId: String
        -date: Date
        -status: String
        -notes: String
        +markAttendance()
        +generateReport()
    }

    %% Relationships
    UserAccount "1" -- "0..*" MedicationRequest : creates
    UserAccount "1" -- "0..*" Appointment : books
    UserAccount "1" -- "0..*" EmergencyAlert : raises
    UserAccount "1" -- "0..*" AnonymousReport : submits
    UserAccount "1" -- "0..*" AttendanceRecord : owns
```

---

### 📝 Design Notes

- This diagram uses **composition and association** to represent relationships between classes.
- The `UserAccount` class is central, managing all key user interactions.
- Each class contains key methods aligned with system use cases and behavior models from previous assignments.
