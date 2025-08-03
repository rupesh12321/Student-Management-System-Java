package com.sms.main;

import java.util.List;
import java.util.Scanner;
import com.sms.model.Student;
import com.sms.service.StudentService;

public class StudentManagementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    boolean added = studentService.addStudent(id, name, course, marks);
                    if (added) {
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Failed to add student!");
                    }
                    break;

                case 2:
                    List<Student> students = studentService.viewAllStudents();
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to update marks: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new marks: ");
                    double newMarks = sc.nextDouble();

                    boolean updated = studentService.updateMarks(updateId, newMarks);
                    if (updated) {
                        System.out.println("Marks updated successfully!");
                    } else {
                        System.out.println("Failed to update marks!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = studentService.deleteStudent(deleteId);
                    if (deleted) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Failed to delete student!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        }
    }
}
