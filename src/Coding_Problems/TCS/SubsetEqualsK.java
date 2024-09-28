package Coding_Problems.TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SubsetsWithSumK {

    // Function to find all subsets with a sum equals to k
    public static void findSubsetsWithSumK(int[] arr, int k) {
        List<Integer> subset = new ArrayList<>();
        findSubsets(arr, k, 0, subset);
    }

    // Recursive helper function to find subsets
    private static void findSubsets(int[] arr, int k, int index, List<Integer> subset) {
        // If the sum of the current subset equals k, print it
        int sum = 0;
        for (int num : subset) {
            sum += num;
        }
        if (sum == k) {
            System.out.println(subset);
        }
        // Explore all subsets starting from the current index
        for (int i = index; i < arr.length; i++) {
            subset.add(arr[i]);
            findSubsets(arr, k, i + 1, subset);
            subset.remove(subset.size() - 1); // Backtrack to explore other subsets
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements in the set
        System.out.print("Enter number of elements in the set: ");
        int n = sc.nextInt();

        // Input the elements of the set
        int[] arr = new int[n];
        System.out.println("Enter elements of the set:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the value of k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Find and print subsets with sum equals to k
        System.out.println("Subsets with sum equal to " + k + " are:");
        findSubsetsWithSumK(arr, k);

        sc.close();
    }
}
