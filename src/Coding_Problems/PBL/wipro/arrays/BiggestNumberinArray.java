package wipro.arrays;

public class BiggestNumberinArray {
    public static void main(String[] args) {
        // Check if exactly 9 arguments are provided
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        // Initialize a 2D array to hold the numbers
        int[][] array = new int[3][3];
        int index = 0;

        // Populate the array with command line arguments
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array[i][j] = Integer.parseInt(args[index]);
                    index++;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
            return;
        }

        // Print the array
        System.out.println("The given array is:");
        printArray(array);

        // Find the biggest number in the array
        int biggest = findBiggestNumber(array);

        // Print the result
        System.out.println("The biggest number in the given array is " + biggest);
    }

    // Method to print the 2D array
    private static void printArray(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to find the biggest number in the 2D array
    private static int findBiggestNumber(int[][] array) {
        int biggest = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > biggest) {
                    biggest = array[i][j];
                }
            }
        }
        return biggest;
}

}
