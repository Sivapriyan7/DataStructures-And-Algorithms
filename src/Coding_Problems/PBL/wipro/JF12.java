package wipro;//  Write a program to receive a color code from the user (an Alphabhet).

// The program should then print the color name, based on the color code given. 

// The following are the color codes and their corresponding color names.
// R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 

// If color code provided by the user is not valid then print "Invalid Code". 

import java.util.*;

public class JF12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        char ch=sc.next().charAt(0);

        if(ch=='R')
        {
            System.out.println("Red");
        }
        else if(ch=='B')
        {
            System.out.println("Blue");
        }
        else if(ch=='G')
        {
            System.out.println("Green");
        }
        else if(ch=='O')
        {
            System.out.println("Orange");
        }
        else if(ch=='Y')
        {
            System.out.println("Yellow");
        }
        else if(ch=='W')
        {
            System.out.println("white");
        }
        else
        {
            System.out.println("Invalid Code");
        }
    }
}
