package Coding_Problems.TCS;
import java.util.Scanner;

public class BookExchange {
    // Modulo constant
    static final int MOD = 100000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Base cases for derangements
        if (n == 1) {
            System.out.println(0);
            return;
        }
        if (n == 2) {
            System.out.println(1);
            return;
        }

        // Array to store derangements up to n
        long[] derangements = new long[n + 1];

        // Initializing base cases
        derangements[1] = 0; // D(1) = 0
        derangements[2] = 1; // D(2) = 1

        // Compute derangements using the recurrence relation
        for (int i = 3; i <= n; i++) {
            derangements[i] = ((i - 1) * (derangements[i - 1] + derangements[i - 2])) % MOD;
        }

        // Output the result for D(n)
        System.out.println(derangements[n]);
    }
}
