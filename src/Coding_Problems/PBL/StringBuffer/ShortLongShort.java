package Coding_Problems.PBL.StringBuffer;

public class ShortLongShort {

    // Method to return a new string in the form short + long + short
    public static String shortLongShort(String a, String b) {
        // Determine which string is shorter and which is longer
        String shortStr = a.length() < b.length() ? a : b;
        String longStr = a.length() >= b.length() ? a : b;

        // Concatenate the strings in the format short + long + short
        return shortStr + longStr + shortStr;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1
        String str1 = "hi";
        String str2 = "hello";
        System.out.println("Input: " + str1 + ", " + str2);
        System.out.println("Output: " + shortLongShort(str1, str2));

        // Additional Examples
        String str3 = "abc";
        String str4 = "defgh";
        System.out.println("Input: " + str3 + ", " + str4);
        System.out.println("Output: " + shortLongShort(str3, str4));

        String str5 = "";
        String str6 = "world";
        System.out.println("Input: " + str5 + ", " + str6);
        System.out.println("Output: " + shortLongShort(str5, str6));
    }
}
