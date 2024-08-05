package Coding_Problems.PBL.StringBuffer;

public class RemoveFirstAndLastChar {

    // Method to return a new string without the first and last characters
    public static String removeFirstAndLastChar(String str) {
        // Check if the string length is less than or equal to 2
        if (str.length() <= 2) {
            // Return an empty string if the length is 2 or less
            return "";
        }
        // Return the substring without the first and last characters
        return str.substring(1, str.length() - 1);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1
        String input = "Suman";
        System.out.println("Input: " + input);
        System.out.println("Output: " + removeFirstAndLastChar(input));
    }
}
