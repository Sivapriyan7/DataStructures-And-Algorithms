package wipro.ExceptionHandling;
import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input number of elements
            System.out.println("Enter the number of elements in the array");
            int size = Integer.parseInt(scanner.nextLine());

            // Input elements of the array
            int[] array = new int[size];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
            }

            // Input index
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(scanner.nextLine());

            // Access and print the array element at the given index
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");

        } catch (NumberFormatException e) {
            // Handles case where input is not an integer
            System.out.println("java.lang.NumberFormatException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles case where index is out of bounds
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            // Handles any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

