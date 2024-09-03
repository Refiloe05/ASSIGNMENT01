/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.studentmanagementapplication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author refil
 */
public class StudentTest {
    
    public StudentTest() {
    }
@Test
    public void testSaveStudent() {
        StudentManagement sm = new StudentManagement();
        Student student = new Student("1", "John Doe", 20, "john@example.com", "CS");
        boolean isSaved = sm.saveStudent(student);
        assertTrue(isSaved, "The student should be saved successfully.");
    }

    @Test
    public void testSearchStudent() {
        StudentManagement sm = new StudentManagement();
        Student student = new Student("1", "John Doe", 20, "john@example.com", "CS");
        sm.saveStudent(student);
        Student foundStudent = sm.searchStudent("1");
        assertNotNull(foundStudent, "The student should be found.");
        assertEquals("John Doe", foundStudent.getName(), "The student name should match.");
    }

    @Test
    public void testSearchStudent_StudentNotFound() {
        StudentManagement sm = new StudentManagement();
        Student foundStudent = sm.searchStudent("999");
        assertNull(foundStudent, "No student should be found with the given ID.");
    }

    @Test
    public void testDeleteStudent() {
        StudentManagement sm = new StudentManagement();
        Student student = new Student("1", "John Doe", 20, "john@example.com", "CS");
        sm.saveStudent(student);
        boolean isDeleted = sm.deleteStudent("1");
        assertTrue(isDeleted, "The student should be deleted successfully.");
    }

    @Test
    public void testDeleteStudent_StudentNotFound() {
        StudentManagement sm = new StudentManagement();
        boolean isDeleted = sm.deleteStudent("999");
        assertFalse(isDeleted, "No student should be found to delete.");
    }

    @Test
    public void testStudentAge_StudentAgeValid() {
        StudentManagement sm = new StudentManagement();
        boolean isValid = sm.validateStudentAge(20);
        assertTrue(isValid, "The student age should be valid.");
    }

    @Test
    public void testStudentAge_StudentAgelnvalid() {
        StudentManagement sm = new StudentManagement();
        boolean isValid = sm.validateStudentAge(15);  // assuming age less than 16 is invalid
        assertFalse(isValid, "The student age should be invalid.");
    }

    @Test
    public void testStudentAge_StudentAgeInvalidCharacter() {
        StudentManagement sm = new StudentManagement();
        try {
            boolean isValid = sm.validateStudentAge("abc"); // Assuming validateStudentAge accepts String
            fail("An exception should be thrown for non-numeric age.");
        } catch (NumberFormatException e) {
            assertTrue(true, "Expected NumberFormatException to be thrown.");
        }
    }
}
