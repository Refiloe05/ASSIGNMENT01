/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementapplication;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author refil
 */
public class Student {
    // Fields for student details
    private String studentID;
    private String name;
    private int age;
    private String email;
    private String course;

    // Constructor
    public Student(String studentID, String name, int age, String email, String course) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    // Method to print student details
    public void printStudentDetails() {
        System.out.println("STUDENT ID: " + studentID);
        System.out.println("STUDENT NAME: " + name);
        System.out.println("STUDENT AGE: " + age);
        System.out.println("STUDENT EMAIL: " + email);
        System.out.println("STUDENT COURSE: " + course);
        System.out.println("---------------------------------------------");
    }

    
}

