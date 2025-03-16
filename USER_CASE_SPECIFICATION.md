# Use Case Specifications

## 1. Use Case: Check Attendance
**Actor:** Student  
**Precondition:** Student is logged into the system.  
**Postcondition:** Attendance record is displayed.  
**Basic Flow:**
1. Student selects 'Check Attendance' from the dashboard.
2. System retrieves attendance records.
3. System displays attendance status for the student.  
   **Alternative Flow:**
- If the record is missing, display an error message.

---

## 2. Use Case: Mark Attendance
**Actor:** Lecturer  
**Precondition:** Lecturer is logged in and has an assigned class.  
**Postcondition:** Attendance is recorded in the system.  
**Basic Flow:**
1. Lecturer selects 'Mark Attendance'.
2. Lecturer scans student IDs or marks manually.
3. System updates attendance records.  
   **Alternative Flow:**
- If a student is not registered, display an error.

---

## 3. Use Case: View Attendance Report
**Actor:** Parent/Guardian  
**Precondition:** Parent has access to student records.  
**Postcondition:** Attendance report is displayed.  
**Basic Flow:**
1. Parent logs in and selects 'View Attendance Report'.
2. System retrieves student data.
3. System displays report in a readable format.  
   **Alternative Flow:**
- If data is unavailable, system prompts administrator.

---

## 4. Use Case: Manage Timetable
**Actor:** Lecturer  
**Precondition:** Lecturer has schedule editing rights.  
**Postcondition:** Updated timetable is saved.  
**Basic Flow:**
1. Lecturer selects 'Manage Timetable'.
2. System loads current schedule.
3. Lecturer modifies schedule and submits.
4. System saves changes and notifies students.  
   **Alternative Flow:**
- If a schedule conflict is detected, alert the lecturer.

---

## 5. Use Case: View Timetable
**Actor:** Student  
**Precondition:** Timetable is available in the system.  
**Postcondition:** Displayed timetable.  
**Basic Flow:**
1. Student selects 'View Timetable'.
2. System retrieves class schedule.
3. Timetable is displayed.  
   **Alternative Flow:**
- If no timetable is found, system displays a message.

---

## 6. Use Case: Receive Notifications
**Actor:** Student  
**Precondition:** Student is subscribed to notifications.  
**Postcondition:** Student receives relevant notifications.  
**Basic Flow:**
1. System detects a schedule change.
2. Notification is sent to the student.
3. Student reads the notification.  
   **Alternative Flow:**
- If the message fails, retry sending.

---

## 7. Use Case: Book Campus Facility
**Actor:** Student  
**Precondition:** Student has facility access rights.  
**Postcondition:** Booking confirmation is generated.  
**Basic Flow:**
1. Student selects 'Book Facility'.
2. System displays available facilities.
3. Student selects a facility and submits a request.
4. System confirms the booking.  
   **Alternative Flow:**
- If no slots are available, display an error.

---

## 8. Use Case: Generate Reports
**Actor:** Administrator  
**Precondition:** Admin has report generation access.  
**Postcondition:** Report is generated.  
**Basic Flow:**
1. Administrator selects 'Generate Reports'.
2. System retrieves data.
3. Report is compiled and displayed.  
   **Alternative Flow:**
- If report generation fails, retry automatically.
