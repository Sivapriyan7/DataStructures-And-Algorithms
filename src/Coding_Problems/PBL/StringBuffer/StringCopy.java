package Coding_Problems.PBL.StringBuffer;

public class StringCopy {

    // Method to create a new string with 'n' copies of the first 2 chars
    public static String repeatFirstTwoChars(String str) {
        // Check if the string length is less than 2
        if (str.length() < 2) {
            return str.repeat(str.length()); // If less than 2, repeat the string itself
        }

        // Get the first 2 characters of the string
        String firstTwoChars = str.substring(0, 2);

        // Get the length of the string
        int n = str.length();

        // Create a new string with 'n' copies of the first 2 chars
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(firstTwoChars);
        }

        return result.toString();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1
        String input = "Wipro";
        System.out.println("Input: " + input);
        System.out.println("Output: " + repeatFirstTwoChars(input));
    }
}
