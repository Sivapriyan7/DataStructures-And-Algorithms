package Coding_Problems.Accenture;

import java.io.FilterOutputStream;

public class CheckPassword {

    public static boolean passwordChecker(String pass)
    {
        boolean numeric_1 = false;
        boolean capital_1 = false;
        boolean space_slash = true;

        if(pass.length()<4)
        {
            return false;
        }
        if(Character.isDigit(pass.charAt(0)))
        {
            return false;
        }
        for (int i=0; i<pass.length(); i++)
        {
            if(Character.isUpperCase(pass.charAt(i)))
            {
                capital_1 = true;
            }
            else if(Character.isDigit(pass.charAt(i))) {
                numeric_1 = true;
            }
            else if(pass.charAt(i)==' '||pass.charAt(i)=='/')
            {
                return false;
            }
        }
        return capital_1 && numeric_1;
    }

    public static void main(String[] args) {
        String str = "bB1_89";
        System.out.println(passwordChecker(str));
    }
}
