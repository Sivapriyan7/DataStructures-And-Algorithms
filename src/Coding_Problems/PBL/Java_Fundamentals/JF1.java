package Coding_Problems.PBL;// Write a Program that accepts two Strings as command line arguments and generate the output in the required format.

// Example1)
// If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

// Example2)
// If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 

// [Note: It is mandatory to pass two arguments in command line]

import java.util.*;

public class JF1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str1=sc.next();
        String str2=sc.next();

        System.out.println(str1+" Technologies "+str2);

    }
}
