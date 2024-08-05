package Coding_Problems.PBL.StringBuffer;

public class MergeStrings {

    // Method to merge two strings by alternating characters
    public static String mergeAlternating(String a, String b) {
        StringBuilder result = new StringBuilder();

        // Determine the length of the shorter string
        int minLength = Math.min(a.length(), b.length());

        // Alternate characters from both strings up to the length of the shorter string
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        // Append the remaining characters from the longer string
        if (a.length() > b.length()) {
            result.append(a.substring(minLength));
        } else {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1
        String inputA1 = "Hello";
        String inputB1 = "World";
        System.out.println("Input: " + inputA1 + ", " + inputB1);
        System.out.println("Output: " + mergeAlternating(inputA1, inputB1));

        // Additional Examples
        String inputA2 = "abc";
        String inputB2 = "123456";
        System.out.println("Input: " + inputA2 + ", " + inputB2);
        System.out.println("Output: " + mergeAlternating(inputA2, inputB2));

        String inputA3 = "abcd";
        String inputB3 = "xy";
        System.out.println("Input: " + inputA3 + ", " + inputB3);
        System.out.println("Output: " + mergeAlternating(inputA3, inputB3));
    }
}
