package Coding_Problems.PrepInsta100;

public class PrimeBwRange {

    public static boolean isPrime(int num)
    {
        if (num < 2 ) return false;

        for (int i=2; i<num; i++)
        {
            if (num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int lower = 1 ;
        int higher = 100;

        for (int i=lower; i<higher; i++)
        {
            if(isPrime(i)) System.out.print(i+" ");
        }
    }
}
