package Coding_Problems.Accenture;

public class SmallLargeSum {

    // Helper method to find the second largest element in an array
    public static int findSecondLargest(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    // Method to find the sum of the second largest even-indexed and odd-indexed elements
    public static int SmallLargeSum(int[] array) {
        // Separate the even-indexed and odd-indexed elements
        int[] evenIndexed = new int[(array.length + 1) / 2];
        int[] oddIndexed = new int[array.length / 2];
        int evenIdx = 0, oddIdx = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenIndexed[evenIdx++] = array[i];
            } else {
                oddIdx = array[i];
            }
        }

        // Find the second largest elements in both even-indexed and odd-indexed arrays
        int secondLargestEven = findSecondLargest(evenIndexed);
        int secondLargestOdd = findSecondLargest(oddIndexed);

        // Return the sum of the second largest elements
        return secondLargestEven + secondLargestOdd;
    }

    public static void main(String[] args) {
        int[] array = {3,2,1,7,5,4};
        System.out.println("Sum of second largest even-indexed and second largest odd-indexed elements: " + SmallLargeSum(array));
    }
}
