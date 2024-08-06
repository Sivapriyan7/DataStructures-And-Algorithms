package wipro.arrays;

public class reversearray14 {
    public static void main(String[] args) {
        // Check if exactly 4 arguments are provided
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        // Initialize a 2D array to hold the numbers
        int[][] array = new int[2][2];
        int index = 0;

        // Populate the array with command line arguments
        try {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    array[i][j] = Integer.parseInt(args[index]);
                    index++;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
            return;
        }

        // Print the original array
        System.out.println("The given array is:");
        printArray(array);

        // Reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("The reverse of the array is:");
        printArray(array);
    }

    // Method to print the 2D array
    private static void printArray(int[][] array) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to reverse the elements of the 2D array
    private static void reverseArray(int[][] array) {
        // Swap elements diagonally
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
}