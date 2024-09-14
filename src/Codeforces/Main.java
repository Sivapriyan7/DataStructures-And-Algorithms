package Codeforces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers a and b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calculate the late brother number
        int lateBrother = 6 - (a + b);

        // Output the result
        System.out.println(lateBrother);

        // Close the scanner
        scanner.close();
    }
}
