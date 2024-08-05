//  Initialize two character variables in a program and display the characters in alphabetical order.

// Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

// Example2) if the first character is 'a' and second character is 'e', then the output should be a,e


import java.util.*;

public class JF8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);

        if(ch1>ch2)
        {
            System.out.print(ch2+","+ch1);
        }
        else
        {
            System.out.print(ch1+","+ch2);
        }
        
    }
}