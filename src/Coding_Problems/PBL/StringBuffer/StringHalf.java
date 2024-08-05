package Coding_Problems.PBL.StringBuffer;

public class StringHalf {

    // Method to return the first half of the string if its length is even
    public static String getFirstHalfIfEven(String str) {
        // Get the length of the string
        int length = str.length();

        // Check if the length is even
        if (length % 2 == 0) {
            // Return the first half of the string
            return str.substring(0, length / 2);
        } else {
            // Return null if the length is odd
            return null;
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1
        String input1 = "TomCat";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + getFirstHalfIfEven(input1));

        // Example 2
        String input2 = "Apron";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + getFirstHalfIfEven(input2));
    }
}
