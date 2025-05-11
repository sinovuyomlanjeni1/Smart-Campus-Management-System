# Smart-Campus-Management-System


## Project Overview
The **Smart Campus Management System** is designed to streamline and automate various campus activities, including student attendance tracking, timetable management, and real-time notifications. This system will enhance efficiency and communication within an educational institution.

## Features
- **Automated Attendance Tracking**: Students check in via RFID or a mobile app.
- **Timetable Management**: Digital schedules for students and faculty.
- **Real-time Notifications**: Updates on class changes, events, and announcements.
- **Resource Booking**: Room and lab reservations for students and staff.

## Technology Stack
- **Frontend**: React.js
- **Backend**: Node.js with Express.js
- **Database**: PostgreSQL
- **Authentication**: OAuth 2.0 / Firebase Authentication
- **Deployment**: AWS / Digital Ocean

## Repository Structure
```plaintext
├── README.md
├── SPECIFICATION.md
├── ARCHITECTURE.md
├── src/
│   ├── frontend/
│   ├── backend/
│   ├── database/
├── docs/
└── diagrams/
```

## Documentation
- [System Specification](SPECIFICATION.md)
- [C4 Architecture Diagrams](ARCHITECTURE.md)

  
## 🛡️ Justification for Repository Interface Design

- **Use of Generics in Repository Interface:**
  - Implemented a generic `Repository<T, ID>` interface to avoid duplication of CRUD methods across different entity repositories (e.g., `UserAccountRepository`, `MedicationRequestRepository`, etc.).
  - This ensures **reusability**, **type safety**, and **consistency** in how different objects are stored, retrieved, and managed.

- **Entity-Specific Repository Interfaces:**
  - Created interfaces like `UserAccountRepository` to **specialize** the generic repository for each domain entity.
  - This approach follows the **Interface Segregation Principle (ISP)** by keeping interfaces focused and minimal.

- **Advantages of This Design:**
  - Easy to add new repositories for new models (e.g., `AppointmentRepository`) without rewriting CRUD logic.
  - Clear contract for operations on different entities.
  - Encourages **DRY** (Don't Repeat Yourself) coding practices across persistence layers.

## Added a Workflow

# 📚 Smart Campus Management System

This is a Spring Boot-based system for managing campus resources, users, and activity workflows.

---

## 🧪 Running Tests Locally

To run all unit and integration tests:

```bash
./mvnw clean test
# OR
mvn clean test

