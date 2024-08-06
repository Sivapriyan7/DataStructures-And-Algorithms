package wipro.IOStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input file name:");
        String inputFileName = scanner.nextLine();

        System.out.println("Enter the output file name:");
        String outputFileName = scanner.nextLine();

        try {
            copyFile(inputFileName, outputFileName);
            System.out.println("File is copied.");
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }

        scanner.close();
    }

    private static void copyFile(String inputFileName, String outputFileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
