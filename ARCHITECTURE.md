# System Architecture Document

## 1. Introduction

### 1.1 Project Title
**Smart Campus Management System**

### 1.2 Domain
**Education Technology**

### 1.3 Problem Statement
Managing various campus activities like attendance tracking, timetable management, and event notifications manually is inefficient. The **Smart Campus Management System** provides an integrated solution to automate these tasks.

## 2. C4 Model Overview
The system architecture follows the **C4 model**, which consists of four levels:
- **Level 1: System Context Diagram**
- **Level 2: Container Diagram**
- **Level 3: Component Diagram**
- **Level 4: Code Diagram** 

## 3. C4 Diagrams

### 3.1 System Context Diagram
```mermaid
C4Context
  Person(student, "Student", "Interacts with the system for attendance and notifications")
  Person(teacher, "Teacher", "Manages class schedules and attendance")
  Person(admin, "Administrator", "Oversees system operations")
  System(campusSystem, "Smart Campus Management System", "Handles attendance, timetables, and notifications")








```

### 3.2 Container Diagram
```mermaid
C4Container
  System_Boundary(campusSystem, "Smart Campus Management System") {
    Container(webApp, "Web Application", "React.js", "Front-end interface")
    Container(mobileApp, "Mobile App", "React Native", "Mobile access")
    Container(api, "Backend API", "Node.js & Express", "Handles business logic")
    ContainerDb(database, "Database", "PostgreSQL", "Stores user data")
  }
  
```

### 3.3 Component Diagram
```mermaid
C4Component
  Container(api, "Backend API", "Node.js & Express")
    Component(authService, "Authentication Service", "Manages user authentication")
    Component(attendanceService, "Attendance Service", "Handles student check-ins")
    Component(notificationService, "Notification Service", "Sends real-time alerts")
    Component(timetableService, "Timetable Service", "Manages class schedules")
 
 
```

## 4. Conclusion
This architecture ensures scalability, maintainability, and efficiency for campus management operations. Future improvements may include AI-powered analytics and deeper integration with learning management systems.
