package com.sms.model;

public class Student {
    private int id;
    private String name;
    private String course;
    private double marks;

    // Constructor
    public Student(int id, String name, String course, double marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // ToString method (print student details easily)
    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Course=" + course + ", Marks=" + marks + "]";
    }
}

