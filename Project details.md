# Student Record Management System

## Problem Statement

Educational institutions often manage student information, attendance, and academic marks manually using registers or spreadsheets. This manual approach is time-consuming, error-prone, and makes it difficult to retrieve, update, or analyze student data quickly. There is a need for a centralized, web-based system that allows authorized users to efficiently add, update, delete, and view student records, track attendance, and manage academic marks in an organized and reliable manner.

## Project Objectives

- To design and develop a web-based Student Record Management System.
- To provide functionality for adding, viewing, updating, and deleting student records.
- To enable attendance marking and tracking for each student.
- To allow entry and viewing of student marks across different exam types (e.g., Midterm, Final).
- To provide a centralized dashboard for easy navigation across all modules.
- To ensure data is stored persistently using a relational database.
- To build a system that is simple, user-friendly, and accessible through a web browser.

## Tables List

| Table Name | Description |
|---|---|
| Student | Stores student personal details such as first name, last name, and email |
| Attendance | Stores daily attendance records linked to a student |
| Marks | Stores subject-wise marks obtained by a student for different exam types |

### Table Fields

**Student**
- First Name
- Last Name
- Email

**Attendance**
- Student ID (FK)
- Date
- Status (Present / Absent)

**Marks**
- Student ID (FK)
- Subject
- Marks Obtained
- Total Marks
- Exam Type (e.g., Midterm, Final)

## Module List

1. **Dashboard Module** – Central navigation hub linking to all system features.
2. **Student Management Module** – Add, View, Update, and Delete student records.
3. **Attendance Management Module** – Mark daily attendance and view attendance records.
4. **Marks Management Module** – Enter subject-wise marks and view marks records.
5. **Logout Module** – Ends the current session securely.

## Technology Stack

- **Frontend:** HTML, Thymeleaf Templates
- **Backend:** Java, Spring Boot
- **Database:** MySQL (via Spring Data JPA)
- **Deployment:** Railway
-
