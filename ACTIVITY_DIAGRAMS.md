
## 💊 Activity: `Collect Medication`
```mermaid
flowchart TD
    A(Start) --> B[Login]
    B --> C[View approved requests]
    C --> D[Select pickup time]
    D --> E[Confirm booking]
    E --> F{Arrives on time?}
    F -- Yes --> G[Pharmacist confirms collection]
    G --> H[System logs pickup]
    H --> I(End)
    F -- No --> J[Mark as missed]
    J --> K[Send alert to clinic]
    K --> I
```

### 🔗 Traceability
- User Story: *US-005 (pickup reminder)*
- Functional Requirement: *“Log medication pickup and trigger alerts on misses.”*

---

## 📅 Activity: `Book Appointment`
```mermaid
flowchart TD
    A(Start) --> B[Login to system]
    B --> C[Navigate to appointment section]
    C --> D[Choose doctor/date/time]
    D --> E[Check availability]
    E --> F{Slot available?}
    F -- Yes --> G[Book appointment]
    G --> H[Send confirmation email]
    H --> I(End)
    F -- No --> J[Prompt to select new slot]
    J --> D
```

### 🔗 Traceability
- User Story: *US-004 (lecturer schedules appointment)*
- Functional Requirement: *“Users must book appointments with available practitioners.”*

---

## 🚨 Activity: `Trigger Emergency Alert`
```mermaid
flowchart TD
    A(Start) --> B[Login]
    B --> C[Click emergency alert button]
    C --> D[System captures location]
    D --> E[Send alert to nearest clinic]
    E --> F[Clinic acknowledges alert]
    F --> G[Notify user of response]
    G --> H(End)
```

### 🔗 Traceability
- User Story: *US-006 (emergency intervention)*
- Functional Requirement: *“Enable fast response to user emergencies.”*

---

## 🕵️ Activity: `Submit Anonymous Report`
```mermaid
flowchart TD
    A(Start) --> B[Access report form anonymously]
    B --> C[Fill in details of incident]
    C --> D[Attach optional proof]
    D --> E[Submit report]
    E --> F[System validates input]
    F --> G{Valid?}
    G -- Yes --> H[Store report securely]
    H --> I[Notify admin for review]
    I --> J(End)
    G -- No --> K[Show error message]
    K --> C
```

### 🔗 Traceability
- User Story: *US-007 (confidential report)*
- Functional Requirement: *“Allow users to anonymously report misuse or non-compliance with privacy preserved.”*

---

## 🧾 Activity: `Log Attendance`
```mermaid
flowchart TD
    A(Start) --> B[User logs into system]
    B --> C[Navigate to attendance module]
    C --> D[Select date or session]
    D --> E[Mark present/absent/late]
    E --> F[System records entry]
    F --> G[Generate confirmation]
    G --> H(End)
```

### 🔗 Traceability
- User Story: *US-002 (lecturer marks attendance)*
- Functional Requirement: *“System must log user attendance per session.”*
