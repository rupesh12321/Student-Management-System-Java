package com.sms.service;

import java.util.List;
import com.sms.dao.StudentDAO;
import com.sms.model.Student;

public class StudentService {
    private StudentDAO studentDAO;

    public StudentService() {
        studentDAO = new StudentDAO();
    }

    // Add student
    public boolean addStudent(int id, String name, String course, double marks) {
        Student student = new Student(id, name, course, marks);
        return studentDAO.addStudent(student);
    }

    // View all students
    public List<Student> viewAllStudents() {
        return studentDAO.getAllStudents();
    }

    // Update marks
    public boolean updateMarks(int id, double newMarks) {
        return studentDAO.updateStudentMarks(id, newMarks);
    }

    // Delete student
    public boolean deleteStudent(int id) {
        return studentDAO.deleteStudent(id);
    }
}
