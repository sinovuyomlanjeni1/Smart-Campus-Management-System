# System Requirements Document

## 1. Functional Requirements

| ID | Requirement | Acceptance Criteria |
|----|------------|---------------------|
| FR1 | The system shall allow students to check attendance via RFID or mobile app. | Attendance should be updated in real-time and visible in student profiles. |
| FR2 | The system shall enable lecturers to mark attendance manually if needed. | Lecturers should be able to override attendance records with reason logging. |
| FR3 | The system shall provide real-time notifications for class schedule updates. | Notifications should be sent via email and mobile push within 5 seconds. |
| FR4 | The system shall allow administrators to generate attendance reports. | Reports should be exportable in CSV and PDF format. |
| FR5 | The system shall enable students to view timetables dynamically. | Timetables should update automatically if changes are made by lecturers. |
| FR6 | The system shall allow room and lab bookings for students and faculty. | Users should receive confirmation and reminders for bookings. |
| FR7 | The system shall have multi-role authentication (students, lecturers, admins). | Each user role should have access to relevant system functionalities. |
| FR8 | The system shall support secure login using OAuth 2.0 authentication. | Login attempts must be logged and allow multi-factor authentication. |
| FR9 | The system shall provide an analytics dashboard for university management. | Dashboard should show trends, attendance patterns, and student engagement. |
| FR10 | The system shall integrate with existing university databases. | Student data should sync automatically without manual intervention. |

---

## 2. Non-Functional Requirements

| Category | Requirement |
|----------|------------|
| **Usability** | The interface shall comply with WCAG 2.1 accessibility standards for readability and navigation. |
| **Deployability** | The system shall be deployable on both Windows and Linux servers. |
| **Maintainability** | The system documentation shall include an API guide for future integrations. |
| **Scalability** | The system shall support at least 1,000 concurrent users during peak hours. |
| **Security** | All sensitive user data shall be encrypted using AES-256. |
| **Performance** | Attendance check-in should be processed within 2 seconds. |
| **Availability** | The system shall guarantee 99.9% uptime with failover support. |
| **Data Integrity** | All records shall have automatic backup every 24 hours. |

