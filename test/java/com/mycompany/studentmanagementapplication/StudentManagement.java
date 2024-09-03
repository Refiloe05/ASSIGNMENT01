/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementapplication;
 import java.util.ArrayList;
/**
 *
 * @author refil
 */
class StudentManagement {

    private ArrayList<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public boolean saveStudent(Student student) {
        return students.add(student);
    }

    public Student searchStudent(String id) {
        for (Student student : students) {
            if (student.getStudentID().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent(String id) {
        Student student = searchStudent(id);
        if (student != null) {
            return students.remove(student);
        }
        return false;
    }

    public boolean validateStudentAge(int age) {
        return age >= 16;
    }

    public boolean validateStudentAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return validateStudentAge(age);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid age: " + ageStr);
        }
    }
}

