package Coding_Problems.TCS.TalentBattle;

import java.util.Scanner;

public class FakePallindromeSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int val = sc.nextInt();
        int count = 0;

        for (int i=0; i<str.length(); i++)
        {
            for (int j=i; j<str.length(); j++)
            {
                String var = str.substring(i,j+1);
                if(isPallindrome(var,0,var.length()-1))
                {
                    System.out.println(var);
                    count++;
                }
            }
        }
        System.out.println("Count "+count);
    }

    public static boolean isPallindrome(String str,int start,int end)
    {
        while (start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
