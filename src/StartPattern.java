// Java Program to print pattern
// Number triangle pattern
import java.util.*;

class StarPattern {
    public static void printPattern(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n = 5;
        printPattern(n);
    }
}
