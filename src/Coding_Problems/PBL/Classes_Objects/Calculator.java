package Coding_Problems.PBL.Classes_Objects;

class Calculator {
    // Static method to calculate numi to the power of num2 for integers
    public static int powerInt(int numi, int num2) {
        return (int) Math.pow(numi, num2);
    }

    // Static method to calculate numi to the power of num2 for doubles
    public static double powerDouble(double numi, int num2) {
        return Math.pow(numi, num2);
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Testing powerInt method
        int resultInt = Calculator.powerInt(2, 3);
        System.out.println("2 to the power of 3 is: " + resultInt);

        // Testing powerDouble method
        double resultDouble = Calculator.powerDouble(2.5, 3);
        System.out.println("2.5 to the power of 3 is: " + resultDouble);
    }
}
