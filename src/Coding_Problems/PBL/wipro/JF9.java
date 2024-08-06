package wipro;// Initialize a character variable in a program and

// print 'Alphabhet' if the initialized value is an alphabhet, 

// print 'Digit' if the initialized value is a number, and 

// print 'Special Character', if the initialized value is anything else.

import java.util.*;

public class JF9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch=sc.next().charAt(0);

        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            System.out.println("Alphabhet");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character");
        }
    }
}