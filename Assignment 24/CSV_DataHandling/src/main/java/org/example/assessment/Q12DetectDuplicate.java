package org.example.assessment;

import java.io.FileReader;
import java.util.HashSet;

public class Q12DetectDuplicate {
    public static void main(String[] args) {
        Set<String> seen = new HashSet<>();
        try (CSVReader reader = new CSVReader(new FileReader("students.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (!seen.add(nextLine[0])) {
                    System.out.println("Duplicate record: " + String.join(", ", nextLine));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}