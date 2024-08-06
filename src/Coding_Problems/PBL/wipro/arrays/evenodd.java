package wipro.arrays;
import java.util.Arrays;

public class evenodd {
    public static void main(String[] args) {
        // Check if there are arguments provided
        if (args.length == 0) {
            System.out.println("Please enter integer numbers");
            return;
        }

        // Initialize the array to hold the numbers
        int[] array = new int[args.length];

        // Populate the array with command line arguments
        try {
            for (int i = 0; i < args.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
            return;
        }

        // Rearrange the array so that all even numbers come before all odd numbers
        rearrangeEvenOdd(array);

        // Print the rearranged array
        System.out.println("Rearranged array:");
        System.out.println(Arrays.toString(array));
    }

    // Method to rearrange the array
    private static void rearrangeEvenOdd(int[] array) {
        int[] result = new int[array.length];
        int index = 0;

        // First add all even numbers
        for (int num : array) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        // Then add all odd numbers
        for (int num : array) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        // Copy the result array back to the original array
        System.arraycopy(result, 0, array, 0, array.length);
    }
}