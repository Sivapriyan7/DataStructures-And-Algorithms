package Coding_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {
    /*
     * Complete the 'MaximumLength' function below.
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER x
     * 2. INTEGER ARRAY a
     **/
    public static int MaximumLength(int x, List<Integer> a) {
        int n = a.size();

        // Check if the total sum of the array is not divisible by x
        int totalSum = a.stream().mapToInt(Integer::intValue).sum();
        if (totalSum % x != 0) {
            return n;
        }

        // Find the longest subarray whose sum is not divisible by x
        int left = 0, right = n - 1;

        // Find the first element from the left whose value is not divisible by x
        while (left < n && a.get(left) % x == 0) {
            left++;
        }

        // Find the first element from the right whose value is not divisible by x
        while (right >= 0 && a.get(right) % x == 0) {
            right--;
        }

        // If all elements are divisible by x, no such subarray exists
        if (left >= n || right < 0) {
            return -1;
        }

        // The length of the longest subarray is either removing elements from the start or end
        int longestSubarrayLength = Math.max(n - left - 1, right + 1);

        return longestSubarrayLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer x
        int x = scanner.nextInt();

        // Read the size of the array
        int n = scanner.nextInt();

        // Read the array elements into a list
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        // Close the scanner
        scanner.close();

        // Calculate the maximum length of the subarray whose sum isn't divisible by x
        int result = Result.MaximumLength(x, a);

        // Print the result
        System.out.println(result);
    }
}
