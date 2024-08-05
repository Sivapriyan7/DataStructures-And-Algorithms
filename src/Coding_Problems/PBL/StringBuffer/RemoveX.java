package Coding_Problems.PBL.StringBuffer;

public class RemoveX {

    // Method to return the string with first and/or last 'x' removed
    public static String removeX(String str) {
        // Check if the string is empty
        if (str.isEmpty()) {
            return str;
        }

        // Remove 'x' from the start if it's there
        if (str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        // Remove 'x' from the end if it's there
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1
        String input1 = "xHix";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + removeX(input1));

        // Example 2
        String input2 = "America";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + removeX(input2));

        // Additional Examples
        String input3 = "xHelloWorldx";
        System.out.println("Input: " + input3);
        System.out.println("Output: " + removeX(input3));

        String input4 = "x";
        System.out.println("Input: " + input4);
        System.out.println("Output: " + removeX(input4));

        String input5 = "xxyzx";
        System.out.println("Input: " + input5);
        System.out.println("Output: " + removeX(input5));
    }
}
