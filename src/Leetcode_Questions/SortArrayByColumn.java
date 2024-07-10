//public class SortArrayByColumn {
//}
//
//
//import java.util.Arrays;

import java.util.Arrays;

public class SortArrayByColumn {

    public static void main(String[] args) {
        // Sample 2D array
        int[][] array = {
                {5, 2, 9},
                {1, 4, 6},
                {3, 8, 7}
        };

        // Print the original array
        System.out.println("Original array:");
        print2DArray(array);

        // Sort each column of the array
        sortColumns(array);

        // Print the sorted array
        System.out.println("\nArray with sorted columns:");
        print2DArray(array);
    }

    public static void sortColumns(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        for (int col = 0; col < cols; col++) {
            int[] columnArray = new int[rows];
            for (int row = 0; row < rows; row++) {
                columnArray[row] = array[row][col];
            }

            Arrays.sort(columnArray);

            for (int row = 0; row < rows; row++) {
                array[row][col] = columnArray[row];
            }
        }
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}

