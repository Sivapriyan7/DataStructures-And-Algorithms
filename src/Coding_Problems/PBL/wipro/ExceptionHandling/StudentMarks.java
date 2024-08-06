package wipro.ExceptionHandling;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input names and marks for two students
            System.out.println("Enter the name of the first student:");
            String student1Name = scanner.nextLine();
            System.out.println("Enter the marks for " + student1Name + " in 3 subjects:");

            int[] student1Marks = new int[3];
            for (int i = 0; i < 3; i++) {
                student1Marks[i] = readMarks(scanner);
            }

            System.out.println("Enter the name of the second student:");
            String student2Name = scanner.nextLine();
            System.out.println("Enter the marks for " + student2Name + " in 3 subjects:");

            int[] student2Marks = new int[3];
            for (int i = 0; i < 3; i++) {
                student2Marks[i] = readMarks(scanner);
            }

            // Calculate and display averages
            double avg1 = calculateAverage(student1Marks);
            double avg2 = calculateAverage(student2Marks);

            System.out.println(student1Name + "'s average marks: " + avg1);
            System.out.println(student2Name + "'s average marks: " + avg2);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter valid integer values for marks.");
        } catch (NegativevalueException e) {
            System.out.println("NegativeValueException: " + e.getMessage());
        } catch (outofRangeException e) {
            System.out.println("OutOfRangeException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int readMarks(Scanner scanner) throws NumberFormatException, NegativevalueException, outofRangeException {
        int mark;
        try {
            mark = Integer.parseInt(scanner.nextLine());
            if (mark < 0) {
                throw new NegativevalueException("Marks cannot be negative.");
            }
            if (mark > 100) {
                throw new outofRangeException("Marks must be between 0 and 100.");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number format.");
        }
        return mark;
    }

    private static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}

