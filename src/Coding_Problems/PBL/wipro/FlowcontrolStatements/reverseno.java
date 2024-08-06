package wipro.FlowcontrolStatements;

import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        scanner.close();

        int reversedNum = reverseNumber(num);
        System.out.println("Reversed number: " + reversedNum);
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}

