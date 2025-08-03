# Student Management System

A **console-based Java application** to manage student records (CRUD operations) using **JDBC and MySQL**.  
This project demonstrates modular programming concepts (DAO, Service layers) and database connectivity.

---

## Features
- Add new student details
- View all student records
- Update student marks
- Delete student records
- Simple menu-driven interface

---

## Technologies Used
- **Java (Core)**
- **MySQL Database**
- **JDBC for database connectivity**
- Eclipse IDE

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/rupesh12321/Student-Management-System-Java.git
Open in Eclipse IDE

Set up MySQL database using the provided schema

Run StudentManagementApp.java to start

Database Schema
sql
Copy code
CREATE DATABASE StudentDB;
USE StudentDB;
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(100),
    marks DOUBLE
);
Sample Output
pgsql
Copy code
=== Student Management System ===
1. Add Student
2. View All Students
3. Update Student Marks
4. Delete Student
5. Exit
Author
Rupesh Sharma

Email: rupesharma066@gmail.com

GitHub: rupesh12321
