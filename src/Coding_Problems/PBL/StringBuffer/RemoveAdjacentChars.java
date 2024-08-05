package Coding_Problems.PBL.StringBuffer;

public class RemoveAdjacentChars {

    // Method to remove '*' and its adjacent characters
    public static String removeStarsAndAdjacent(String str) {
        // Find the index of the '*' character
        int index = str.indexOf('*');

        // If '*' is not found or is at the edges of the string
        if (index == -1 || str.length() <= 2) {
            return str; // Return the string unchanged if '*' is not found or string is too short
        }

        // Create a new StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Append characters before the '*' if there's any
        if (index > 0) {
            result.append(str, 0, index - 1);
        }

        // Append characters after the '*' if there's any
        if (index < str.length() - 1) {
            result.append(str.substring(index + 2));
        }

        return result.toString();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1
        String input1 = "ab*cd";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + removeStarsAndAdjacent(input1));

        // Additional Examples
        String input2 = "a*b*c*d";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + removeStarsAndAdjacent(input2));

        String input3 = "*abc*def*";
        System.out.println("Input: " + input3);
        System.out.println("Output: " + removeStarsAndAdjacent(input3));

        String input4 = "abcd";
        System.out.println("Input: " + input4);
        System.out.println("Output: " + removeStarsAndAdjacent(input4));
    }
}
