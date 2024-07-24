package Coding_Problems.PrepInsta100;

public class LCM {

    public static void findLCM(int num1,int num2)
    {
        int max = (num1 > num2) ? num1 : num2;
        int lcm = 0;
        for (int i=max; i<=num1*num2; i++)
        {
            if(i%num1 == 0 && i%num2 == 0)
            {
                lcm = i;
                break;
            }
        }
        System.out.println("Lcm of "+num1+" and "+num2+" is "+lcm);
    }

    public static void main(String[] args) {
        int num1 = 12,num2 = 20;
        findLCM(num1,num2);

    }
}
