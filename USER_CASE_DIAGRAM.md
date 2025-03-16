# Use Case Diagram

## Overview
The following UML use case diagram represents how different actors interact with the **Smart Campus Management System**.

```mermaid
graph TD;
  %% Actors
  student([Student])
  lecturer([Lecturer])
  admin([Administrator])
  itstaff([IT Staff])
  parent([Parent/Guardian])
  management([University Management])

  %% Use Cases
  A[Check Attendance] -->|Uses| B[Mark Attendance]
  A -->|Views| C[View Attendance Report]
  D[Manage Timetable] -->|Updates| E[Edit Timetable]
  D -->|Views| F[View Timetable]
  G[Receive Notifications] -->|Subscribes| H[Manage Notifications]
  I[Book Campus Facility] -->|Confirms| J[Approve Booking]
  K[Generate Reports] -->|Retrieves| L[Download Reports]

  %% Relationships
  student --> A
  lecturer --> B
  lecturer --> D
  admin --> K
  itstaff --> H
  parent --> C
  management --> L
```

## Explanation
- **Key Actors**:
    - **Students**: Check attendance and receive notifications.
    - **Lecturers**: Mark attendance and manage timetables.
    - **Administrators**: Generate reports and approve facility bookings.
    - **IT Staff**: Manage system security and notifications.
    - **Parents/Guardians**: View attendance reports.
    - **University Management**: Download analytics reports.

- **Use Case Relationships**:
    - **Marking attendance** links to **checking attendance**.
    - **Managing timetables** allows both **editing and viewing schedules**.
    - **Receiving notifications** allows managing preferences.
    - **Generating reports** allows downloading data for analysis.

