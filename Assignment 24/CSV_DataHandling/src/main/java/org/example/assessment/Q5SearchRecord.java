package org.example.assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q5SearchRecord {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/assessment/employees.csv"; // CSV file path
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name to search: ");
        String searchName = scanner.nextLine().trim(); // Get input from user
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read header (skip it)
            br.readLine();

            // Search for the employee in the file
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[1].trim(); // Employee Name

                if (name.equalsIgnoreCase(searchName)) { // Case-insensitive comparison
                    System.out.println("\nEmployee Found!");
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: $" + data[3]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nEmployee not found in the records.");
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        scanner.close();
    }
}
