/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventory_management_system;

import java.util.Scanner;

/**
 *
 * @author refil
 */
public class Inventory_Management_System {

    public static void main(String[] args) {
        /* You have to design a Java console for any valid problem that your application must solve. Whether it is a 
            business problem, an idea or a game. UInclude arrays, loops, inheritance, constructors and information hiding. 
            Output must be shown in the form of a report using the console. Unit tests must be used to validate your codes desired result.
            The following Java console created is an Inventory Management System for a retail store.*/ 
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Quantity");
            System.out.println("3. Generate Report");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addProduct(name, quantity);
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    quantity = scanner.nextInt();
                    inventory.updateQuantity(name, quantity);
                    break;
                case 3:
                    inventory.generateReport();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
        
   
