package Coding_Problems.PBL.StringBuffer;

public class StringConcatenation {

    // Method to concatenate two strings and return the result in lowercase without double characters
    public static String concatenateAndFormat(String str1, String str2) {
        // Concatenate the strings with a space in between
        String concatenated = str1 + " " + str2;

        // Convert the concatenated string to lowercase
        concatenated = concatenated.toLowerCase();

        // Remove consecutive duplicate characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < concatenated.length(); i++) {
            // If it's the first character or different from the previous character, append it
            if (i == 0 || concatenated.charAt(i) != concatenated.charAt(i - 1)) {
                result.append(concatenated.charAt(i));
            }
        }

        return result.toString();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1
        String str1 = "Sachin";
        String str2 = "Tendulkar";
        System.out.println("Input: " + str1 + ", " + str2);
        System.out.println("Output: " + concatenateAndFormat(str1, str2));

        // Example 2
        str1 = "Mark";
        str2 = "kate";
        System.out.println("Input: " + str1 + ", " + str2);
        System.out.println("Output: " + concatenateAndFormat(str1, str2));
    }
}
