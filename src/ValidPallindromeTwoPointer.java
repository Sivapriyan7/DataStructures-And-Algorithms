import java.util.Scanner;

class validpalindrome {
    public boolean palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if(!Character.isLetterOrDigit(start))
            {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(end))
            {
                j--;
                continue;
            }
            if(Character.toLowerCase(start)!=Character.toLowerCase(end))
            {
             return false;
            }
            i++;
            j--;

        }
        return true;
    }
}

public class ValidPallindromeTwoPointer {
    public static void main(String args[])
    {
        Scanner  d = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = d.nextLine();
        validpalindrome v = new validpalindrome();
        boolean b = v.palindrome(s);
        System.out.println(b);
    }
}
