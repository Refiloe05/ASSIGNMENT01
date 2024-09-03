/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.inventory_management_system;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author refil
 */
public class InventoryTest {
    
    public InventoryTest() {
    }
private Inventory inventory;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
    }

    @Test
    void testAddProduct() {
        inventory.addProduct("Apple", 50);
        assertEquals(50, inventory.getProductQuantity("Apple"), "Quantity of Apple should be 50");
    }

    @Test
    void testUpdateQuantity() {
        inventory.addProduct("Apple", 50);
        inventory.updateQuantity("Apple", 30);
        assertEquals(30, inventory.getProductQuantity("Apple"), "Quantity of Apple should be 30");
    }

    @Test
    void testGenerateReport() {
        inventory.addProduct("Apple", 50);
        inventory.addProduct("Banana", 30);
        String report = inventory.generateReport();
        assertTrue(report.contains("Apple"), "Report should contain Apple");
        assertTrue(report.contains("Banana"), "Report should contain Banana");
    }
}

