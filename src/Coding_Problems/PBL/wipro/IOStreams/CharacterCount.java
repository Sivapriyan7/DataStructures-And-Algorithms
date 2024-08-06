package wipro.IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        System.out.println("Enter the character to be counted:");
        char charToCount = scanner.nextLine().toLowerCase().charAt(0);

        try {
            int count = countCharacterOccurrences(fileName, charToCount);
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + charToCount + "'");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        scanner.close();
    }

    private static int countCharacterOccurrences(String fileName, char charToCount) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                // Convert to lowercase for case-insensitive comparison
                if (Character.toLowerCase((char) c) == charToCount) {
                    count++;
                }
            }
        }
        return count;
    }
}

