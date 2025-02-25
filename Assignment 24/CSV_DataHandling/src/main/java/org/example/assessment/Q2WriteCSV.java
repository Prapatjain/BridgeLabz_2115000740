package org.example.assessment;


import java.io.*;
public class Q2WriteCSV {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/assessment/Q2output.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("ID,Name,Department,Salary\n");
            writer.write("104,Prapat,Finance,262000\n");
            writer.write("105,Nihit,Sales,158000\n");
            writer.write("106,Sajal,IT,128000\n");
            writer.write("107,Afraj,Manufacturing,158000\n");
            writer.write("108,Aviral,medical,258000\n");
            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

