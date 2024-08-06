package wipro.FlowcontrolStatements;

public class primeornot {

    public static int isPrime(int N) {
        if (N <= 1) {
            return 1; // N is not prime
        }

        // Check for factors from 2 to sqrt(N)
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 1; // N is not prime
            }
        }

        return 2; // N is prime
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(isPrime(7));  // Output: 2 (prime)
        System.out.println(isPrime(10)); // Output: 1 (not prime)
    }
}
