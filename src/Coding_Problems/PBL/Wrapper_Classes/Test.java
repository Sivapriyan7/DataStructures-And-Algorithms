package Coding_Problems.PBL.Wrapper_Classes;

public class Test {

    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        try {
            // Parse the command-line argument to an integer
            int number = Integer.parseInt(args[0]);

            // Convert the integer to binary, octal, and hexadecimal representations
            String binary = Integer.toBinaryString(number);
            String octal = Integer.toOctalString(number);
            String hex = Integer.toHexString(number).toUpperCase();

            // Print the results
            System.out.println("Given Number: " + number);
            System.out.println("Binary equivalent: " + binary);
            System.out.println("Octal equivalent: " + octal);
            System.out.println("Hexadecimal equivalent: " + hex);

        } catch (NumberFormatException e) {
            // Handle the case where the argument is not a valid integer
            System.out.println("The provided argument is not a valid integer.");
        }
    }
}
