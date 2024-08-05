// Write a program to check if the program has received command line arguments or not.

// If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)

// Example1) java Example
// O/P: No values

// Example2) java Example Mumbai Bangalore
// O/P: Mumbai,Bangalore

// [Hint: You can use length property of an array to check its length]

import java.util.*;

public class JF7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        String words[]=str.split(" ");

        String result= String.join(",",words);

        System.out.println(result);
    }
}