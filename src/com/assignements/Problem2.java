package com.assignements;

import java.io.*;

public class Problem2 {
    public static void main(String[] args) {
        String csvFile = "src/com/assignements/employees.csv";
        String managerFile = "src/com/assignements/managers.csv";
        String employeeFile = "src/com/assignements/single_name_employees.csv";


        String line = "";
        String cvsSplitBy = ",";

        try {
            clearTheFile(employeeFile);
            clearTheFile(managerFile);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String headerLine = br.readLine();
            while ((line = br.readLine()) != null ) {
                // use comma as separator
                String[] values = line.split(cvsSplitBy);


                if(values[1].equals("Manager") & values[2].equals("R&D")){
                    createCSVFile(managerFile, values);
                }
                if(values[0].split(" ").length == 1){
                   createCSVFile(employeeFile,values);
                }

            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }

    private static void createCSVFile(String fileName, String[] values) {
        try {

            FileWriter writer = new FileWriter(fileName, true);

            for (String value : values) {
                writer.append(value);
                writer.append(",");
            }
            writer.append("\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }
    public static void clearTheFile(String  file) throws IOException {
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
    }
}
