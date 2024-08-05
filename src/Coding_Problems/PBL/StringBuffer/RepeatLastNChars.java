package Coding_Problems.PBL.StringBuffer;

public class RepeatLastNChars {

    // Method to create a new string with n repetitions of the last n characters
    public static String repeatLastNChars(String str, int n) {
        // Check if n is within the valid range
        if (n < 0 || n > str.length()) {
            throw new IllegalArgumentException("n must be between 0 and the length of the string, inclusive.");
        }

        // Get the last n characters of the string
        String lastNChars = str.substring(str.length() - n);

        // Create a new StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Append last n characters n times
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }

        return result.toString();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1
        String input = "Wipro";
        int n = 3;
        System.out.println("Input: " + input + ", " + n);
        System.out.println("Output: " + repeatLastNChars(input, n));

        // Additional Examples
        String input2 = "JavaProgramming";
        int n2 = 4;
        System.out.println("Input: " + input2 + ", " + n2);
        System.out.println("Output: " + repeatLastNChars(input2, n2));

        String input3 = "Example";
        int n3 = 2;
        System.out.println("Input: " + input3 + ", " + n3);
        System.out.println("Output: " + repeatLastNChars(input3, n3));
    }
}
