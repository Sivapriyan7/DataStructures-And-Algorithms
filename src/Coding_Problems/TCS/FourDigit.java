package Coding_Problems.TCS;

public class FourDigit {
    public static void main(String[] args) {
        int num = 2334;
        int sum_left = 0;
        int sum_right = 0;

        int count = 0;
        while (num>0)
        {
            int digit = num%10;
            if(count<=1)
            {
                sum_right += digit;
            }
            else {
                sum_left += digit;
            }
            count++;
            num/=10;
        }
        System.out.println(sum_right-sum_left);
    }
}

