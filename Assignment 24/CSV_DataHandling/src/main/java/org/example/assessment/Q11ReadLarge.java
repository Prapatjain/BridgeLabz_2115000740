package org.example.assessment;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Q11ReadLarge {
    public static void main(String[] args) {
        int count = 0;
        try (CSVReader reader = new CSVReader(new FileReader("large_students.csv"))) {
            reader.readNext();
            String[] nextLine;
            List<String[]> buffer = new ArrayList<>();
            while ((nextLine = reader.readNext()) != null) {
                buffer.add(nextLine);
                if (buffer.size() == 100) {
                    count += buffer.size();
                    buffer.clear();
                }
            }
            count += buffer.size();
            System.out.println("Total records processed: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}