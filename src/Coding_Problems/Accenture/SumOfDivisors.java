package Coding_Problems.Accenture;

public class SumOfDivisors {

    public static int sumofDivisors(int n)
    {
        int DivisorSum = 0;
        for (int i=1; i<=n; i++)
        {
            if(n%i == 0)
            {
                DivisorSum+=i;
            }
        }
        return DivisorSum;
    }

    public static void main(String[] args) {

        int n = 23;
        System.out.println(sumofDivisors(n));
    }
}
