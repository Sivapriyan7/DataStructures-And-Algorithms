package Coding_Problems.PrepInsta100;

public class Pallindrome {

    public static String isPallindrome(int num)
    {
        int temp = num,rev = 0;
        while (num > 0)
        {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        System.out.println(rev);
        if(temp == rev)
        {
            return "Pallindrome Number";
        }
        else {
            return "Not a Pallindrome Number";
        }
    }

    public static void main(String[] args) {

        System.out.println(isPallindrome(12213));
    }
}
