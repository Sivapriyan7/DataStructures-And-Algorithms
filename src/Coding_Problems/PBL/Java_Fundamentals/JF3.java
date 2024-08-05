package Coding_Problems.PBL;// Write a Program to accept two integers as command line arguments and print the sum of the two numbers

// Example1)
// C:\>java Sample 10 20
// O/P Expected : The sum of 10 and 20 is 30

import java.util.*;

public class JF3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println(num1+num2);
    }
}