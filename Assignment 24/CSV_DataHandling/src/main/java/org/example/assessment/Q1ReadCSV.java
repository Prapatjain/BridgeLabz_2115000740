package org.example.assessment;
import java.io.*;

public class Q1ReadCSV {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/assessment/students.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                System.out.println("ID: " + columns[0] + ", Name: " + columns[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
