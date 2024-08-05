// B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

//      lastDigit(7, 17) → true
//      lastDigit(6, 17) → false
//      lastDigit(3, 113) → true
     

import java.util.*;

public class JF5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int Lastno1=num1%10;
        int Lastno2=num2%10;

        if(Lastno1==Lastno2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}