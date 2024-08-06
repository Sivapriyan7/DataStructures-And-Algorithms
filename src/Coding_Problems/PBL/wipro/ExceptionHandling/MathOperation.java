package wipro.ExceptionHandling;

public class MathOperation {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 integers.");
            return;
        }

        int[] numbers = new int[5];
        int sum = 0;
        double average = 0.0;

        try {
            // Convert command-line arguments to integers and store in the array
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            // Calculate sum of the elements
            for (int number : numbers) {
                sum += number;
            }

            // Calculate average
            average = (double) sum / numbers.length;

            // Display the results
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (NumberFormatException e) {
            // Handles case where input is not a valid integer
            System.out.println("java.lang.NumberFormatException: Invalid integer format.");
        } catch (ArithmeticException e) {
            // Handles any arithmetic exceptions (though not likely in this case)
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            // Handles any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

