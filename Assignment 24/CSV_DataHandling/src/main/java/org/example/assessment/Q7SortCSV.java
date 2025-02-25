package org.example.assessment;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q7SortCSV {
    public static void main(String[] args) {
        List<String[]> records = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader("employees.csv"))) {
            // Read header and store it separately
            String[] header = reader.readNext();
            records.add(header);

            // Read employee data
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                records.add(nextLine);
            }

            // Sort by salary (index 3) in descending order
            records.subList(1, records.size()).sort((a, b) ->
                    Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3]))
            );

            // Print top 5 highest-paid employees
            System.out.println("Top 5 highest-paid employees:");
            System.out.println(String.join(", ", header)); // Print header
            for (int i = 1; i <= 5 && i < records.size(); i++) {
                System.out.println(String.join(", ", records.get(i)));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing salary: " + e.getMessage());
        }
    }
}
