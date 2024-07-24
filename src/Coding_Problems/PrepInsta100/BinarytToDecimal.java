package Coding_Problems.PrepInsta100;

public class BinarytToDecimal {

    public static int getDecimal(int num)
    {
        int decimal = 0;
        int pow = 0;
        while (num > 0)
        {
            int temp = num%10;
            decimal += temp*Math.pow(2,pow);
            num /= 10;
            pow++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int binary = 10100101;
        System.out.println(getDecimal(1010));
    }
}