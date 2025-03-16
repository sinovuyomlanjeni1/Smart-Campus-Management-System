# Test Cases

## 1. Functional Test Cases

| Test Case ID | Requirement ID | Description | Steps | Expected Result | Actual Result | Status |
|-------------|---------------|-------------|-------|-----------------|---------------|--------|
| TC-001 | FR-001 | Student checks attendance | 1. Log in as student <br> 2. Click 'Check Attendance' | Attendance records displayed | - | - |
| TC-002 | FR-002 | Lecturer marks attendance | 1. Log in as lecturer <br> 2. Select class <br> 3. Mark students present | Attendance updated successfully | - | - |
| TC-003 | FR-003 | Parent views attendance report | 1. Log in as parent <br> 2. Click 'View Report' | Report displayed correctly | - | - |
| TC-004 | FR-004 | Lecturer edits timetable | 1. Log in as lecturer <br> 2. Modify class schedule <br> 3. Save changes | Timetable updates successfully | - | - |
| TC-005 | FR-005 | Student views timetable | 1. Log in as student <br> 2. Click 'View Timetable' | Timetable displayed correctly | - | - |
| TC-006 | FR-006 | Student receives notifications | 1. Log in as student <br> 2. Wait for a class update | Notification received | - | - |
| TC-007 | FR-007 | Student books a facility | 1. Log in as student <br> 2. Select facility <br> 3. Submit booking request | Booking confirmation displayed | - | - |
| TC-008 | FR-008 | Admin generates reports | 1. Log in as admin <br> 2. Click 'Generate Report' | Report successfully generated | - | - |

---

## 2. Non-Functional Test Cases

| Test Case ID | Requirement ID | Description | Test Steps | Expected Result | Actual Result | Status |
|-------------|---------------|-------------|------------|-----------------|---------------|--------|
| NTC-001 | NFR-001 | System handles 1,000 concurrent users | Simulate 1,000 user logins | Response time ≤ 2 seconds | - | - |
| NTC-002 | NFR-002 | Data encryption validation | Check database storage for encryption method | All sensitive data stored using AES-256 | - | - |

---

This document ensures that all major system functionalities and performance aspects are tested effectively.
