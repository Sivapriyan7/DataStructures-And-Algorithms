package wipro.FlowcontrolStatements;


import java.util.Scanner;

public class floyds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number:");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Floyd's triangle using for loop:");
        printFloydFor(n);

        System.out.println("\nFloyd's triangle using while loop:");
        printFloydWhile(n);
    }

    public static void printFloydFor(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printFloydWhile(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

