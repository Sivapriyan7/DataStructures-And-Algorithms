package Coding_Problems.Accenture;

public class MaxExponents {
    public static void main(String[] args) {
        int a = 10; // Example value for a
        int b = 20; // Example value for b
        System.out.println("Number with the maximum exponent of 2 between " + a + " and " + b + ": " + intMaxExponents(a, b));
    }

    public static int intMaxExponents(int a, int b) {
        int maxExponent = -1;
        int numberWithMaxExponent = a;

        for (int i = a; i <= b; i++) {
            int currentExponent = getExponentOf2(i);
            if (currentExponent > maxExponent) {
                maxExponent = currentExponent;
                numberWithMaxExponent = i;
            }
        }

        return numberWithMaxExponent;
    }

    private static int getExponentOf2(int num) {
        int count = 0;
        while (num % 2 == 0 && num != 0) {
            num /= 2;
            count++;
        }
        return count;
    }
}
