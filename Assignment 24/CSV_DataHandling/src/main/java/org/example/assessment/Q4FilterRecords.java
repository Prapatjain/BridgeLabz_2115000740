package org.example.assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4FilterRecords {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/assessment/students.csv"; // CSV file name

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the header and print it
            String header = br.readLine();
            if (header != null) {
                System.out.println("\n" + header.replace(",", " | "));
                System.out.println("----------------------------------");
            }

            // Read each line, filter and print students with marks > 80
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[3]); // Convert marks to integer

                if (marks > 80) { // Filter condition
                    System.out.printf("%s | %s | %s | %s%n", data[0], data[1], data[2], data[3]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

