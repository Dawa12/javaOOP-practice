package com.company;

public class Student {
    final private String grade;

    public Student(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                '}';
    }
}
