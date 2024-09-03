/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementapplication;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author refil
 */
public class StudentManagementApplication {
    
    /*  ABC College is a local education provider that specialises in software development, 
        information management, and mobile application development training. The educational 
        provider requests a Java application that manages students,with the following requirements: 
        to save a student, to search a student, to delete a student, to request a student report and to 
        exit the application.*/
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
          while (true) {
            displayMainMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    captureNewStudent();
                    break;
                case "2":
                    searchStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    printStudentReport();
                    break;
                case "5":
                    exitApplication();
                    return;
                default:
                    System.out.println("Exiting application...");
                    return;
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*************************************************");
        System.out.println("Please enter (1) to launch menu or any other key to exit");
        System.out.println("Please select one of the menu items:");
        System.out.println("(1) Capture a new student");
        System.out.println("(2) Search for a student");
        System.out.println("(3) Delete a student");
        System.out.println("(4) Print student report");
        System.out.println("(5) Exit application");
        System.out.print("Your choice: ");
    }

    private static void captureNewStudent() {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("***********************************");

        System.out.print("Enter the student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        int age = 0;
        while (true) {
            System.out.print("Enter student age: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) {
                    break;
                } else {
                    System.out.println("You have entered an incorrect student age!!!! Please re-enter the student age >>");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered an incorrect student age!!!! Please re-enter the student age >>");
            }
        }

        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter student course: ");
        String course = scanner.nextLine();

        Student student = new Student(studentID, name, age, email, course);
        studentList.add(student);

        System.out.println("Student details have been successfully saved.");
        System.out.println("Enter (1) to launch menu or any other key to exit");
    }

    private static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        String studentID = scanner.nextLine();

        Student student = findStudentByID(studentID);
        if (student != null) {
            student.printStudentDetails();
        } else {
            System.out.println("------------------------------------------------------");
            System.out.println("Student with ID: " + studentID + " was NOT found!!!");
            System.out.println("------------------------------------------------------");
        }

        System.out.println("Enter (1) to launch menu or any other key to exit");
    }

    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String studentID = scanner.nextLine();

        Student student = findStudentByID(studentID);
        if (student != null) {
            System.out.println("Are you sure you want to delete Student " + studentID + " from the system? Yes (y) to delete: ");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("y")) {
                studentList.remove(student);
                System.out.println("--------------------------------------------------------");
                System.out.println("Student with student ID: " + studentID + " WAS deleted!!!!!");
                System.out.println("--------------------------------------------------------");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("Student with ID: " + studentID + " was NOT found!!!");
        }

        System.out.println("Enter (1) to launch menu or any other key to exit");
    }

    private static void printStudentReport() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : studentList) {
                student.printStudentDetails();
            }
        }

        System.out.println("Enter (1) to launch menu or any other key to exit");
    }

    private static void exitApplication() {
        System.out.println("Exiting the application. Goodbye!");
    }

    private static Student findStudentByID(String studentID) {
        for (Student student : studentList) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }
}
    
