package Coding_Problems.CTS;

import java.util.Scanner;

public class PallindromeCombinations {

    // Method to check if the string can be a palindrome
    public static boolean isPalindromePossible(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != '?' && str.charAt(right) != '?' && str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to calculate the number of palindrome possibilities
    public static int calculatePalindromeCombinations(String str, int M) {
        if (!isPalindromePossible(str)) {
            return 0;
        }

        int left = 0, right = str.length() - 1;
        long possibilities = 1;

        // Traverse the string to find out how many '?' pairs exist
        while (left < right) {
            if (str.charAt(left) == '?' && str.charAt(right) == '?') {
                possibilities = (possibilities * 26) % M;
            }
            left++;
            right--;
        }

        return (int) possibilities;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // Reading M
        String input = sc.next(); // Reading input string

        // Output the result
        System.out.println(calculatePalindromeCombinations(input, M));

        sc.close();
    }
}
