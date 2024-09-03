/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory_management_system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author refil
 */
public class Inventory {
    
       private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String name, int quantity) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setQuantity(product.getQuantity() + quantity);
                return;
            }
        }
        products.add(new Product(name, quantity));
    }

    public void updateQuantity(String name, int quantity) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setQuantity(quantity);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public int getProductQuantity(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product.getQuantity();
            }
        }
        return -1; // Return -1 if product is not found
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder("Inventory Report:\n");
        for (Product product : products) {
            report.append(product).append("\n");
        }
        return report.toString();
    }
}

