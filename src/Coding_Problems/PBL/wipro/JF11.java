package wipro;//  Initialize a character variable with an alphabhet in a program.

// If the character value is in lowercase, the output should be displayed in uppercase in the following format.

// Example1)
// i/p:a
// o/p:a->A

// If the character value is in uppercase, the output should be displayed in lowercase in the following format.

// Example2)
// i/p:A
// o/p:A->a

import java.util.*;

public class JF11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch=sc.next().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            char cha=(char)(ch+32);
            System.out.println(cha);
        }
        if(ch>='a' && ch<='z')
        {
            char cha=(char)(ch-32);
            System.out.println(cha);
        }
    }
}