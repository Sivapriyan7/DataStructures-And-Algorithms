package Coding_Problems.PBL.Wrapper_Classes;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer from user
        System.out.print("Enter an integer between 1 and 255: ");
        int number = scanner.nextInt();

        // Validate the input
        if (number < 1 || number > 255) {
            System.out.println("The number must be between 1 and 255.");
            scanner.close();
            return;
        }

        // Convert the number to binary string
        String binaryString = Integer.toBinaryString(number);
        System.out.println(binaryString);

        // Format the binary string to be 8 digits long with leading zeros
        String formattedBinaryString = String.format("%8s", binaryString).replace(' ', '0');

        // Print the result
        System.out.println("Binary representation: " + formattedBinaryString);

        scanner.close();
    }
}
