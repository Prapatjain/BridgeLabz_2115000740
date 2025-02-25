package org.example.assessment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Q6ModifyCSV {
    public static void main(String[] args) {
        String inputFile = "src/main/java/org/example/assessment/employees.csv";      // Original CSV file
        String outputFile = "src/main/java/org/example/assessment/updated_employees.csv"; // New updated file
        List<String[]> employeeRecords = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            // Read the header
            String header = br.readLine();
            employeeRecords.add(header.split(",")); // Store header

            // Read and process employee records
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String department = data[2].trim(); // Get department

                if (department.equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(data[3]); // Convert salary to double
                    salary *= 1.10; // Increase by 10%
                    data[3] = String.format("%.2f", salary); // Format salary with 2 decimal places
                }

                employeeRecords.add(data); // Store updated record
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Write updated records to a new CSV file
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(outputFile))) {
            for (String[] record : employeeRecords) {
                bw.write(String.join(",", record));
                bw.newLine();
            }
            System.out.println("Updated salaries saved to 'updated_employees.csv' successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

