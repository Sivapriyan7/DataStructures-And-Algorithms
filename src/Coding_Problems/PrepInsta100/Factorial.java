package Coding_Problems.PrepInsta100;

public class Factorial {

    public static int Factorial(int n)
    {
        if (n==0)
        {
            return 1;
        }
        else {
            return n * Factorial(n-1);
        }
    }


    public static void main(String[] args) {

        int num = 5;
        System.out.println(Factorial(num));

    }
}
