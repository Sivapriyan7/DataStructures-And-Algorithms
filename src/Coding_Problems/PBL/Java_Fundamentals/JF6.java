//  Write a program to check if a given integer number is odd or even.

import java.util.*;

public class JF6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}