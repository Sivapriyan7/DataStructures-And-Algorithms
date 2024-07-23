package Coding_Problems.PrepInsta100;

public class Armstrong {

    public static String isArmstrong(int num)
    {
        String str_num = Integer.toString(num);
        int len = str_num.length();

        int temp = num,sum=0,digit;
        while (temp > 0)
        {
            digit = temp%10;
            sum += Math.pow(digit,len);
            temp = temp/10;
        }
        System.out.println(sum);
        if (sum == num)
        {
            return "Armstrong Number";
        }
        else
        {
            return "Not a Armstrong Number";
        }
    }

    public static void main(String[] args) {

        System.out.println(isArmstrong(371));
    }
}
