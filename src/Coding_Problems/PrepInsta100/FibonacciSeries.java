package Coding_Problems.PrepInsta100;

public class FibonacciSeries {

    public static void FibonacciSeries(int n)
    {
        int num1 = 0,num2 = 1;
        System.out.print(num1 + " " + num2);
        for (int i=2; i<n; i++)
        {
            int num3 = num1+num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
        }
    }


    public static void main(String[] args) {

        int num = 12;
        FibonacciSeries(num);
    }
}
