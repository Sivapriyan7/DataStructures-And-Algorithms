package wipro.LanguageBasics;//  Write a Program to accept a String as a command line argument and print a Welcome message as given below.

// Example1)
// C:\> java Sample John
// O/P Expected : Welcome John

import java.util.*;

public class JF2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str=sc.next();

        System.out.println("Welcome "+str);


    }
}

