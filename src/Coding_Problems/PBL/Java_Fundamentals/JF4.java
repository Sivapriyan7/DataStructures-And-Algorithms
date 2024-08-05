// Write a program to check if a given integer number is Positive, Negative, or Zero. 

import java.util.*;

public class JF4
{
    public static void main(String args)
    {
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();

        if(num==0)
        {
            System.out.println("it is zero");
        }
        else if(num<0)
        {
            System.out.println("it is negitive");
        }
        else
        {
            System.out.println("it is possitive");
        }
    }
}

