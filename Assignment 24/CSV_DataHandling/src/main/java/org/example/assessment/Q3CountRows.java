package org.example.assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q3CountRows {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/assessment/students.csv"; // Path to CSV file
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Read the header line (ignore it)
            String header = br.readLine();

            // Count the remaining lines (actual records)
            while (br.readLine() != null) {
                rowCount++;
            }

            System.out.println("Total number of records (excluding header): " + rowCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

