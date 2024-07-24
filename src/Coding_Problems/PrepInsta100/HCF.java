package Coding_Problems.PrepInsta100;

import java.time.chrono.HijrahDate;

public class HCF {

    public static void HCF(int num1,int num2)
    {
        int Hcf = 0;
        for (int i=1; i<=num1 || i<=num2; i++)
        {
            if(num1%i == 0 && num2%i == 0)
            {
                Hcf = i;
            }
        }
        System.out.println("highest common factor is "+ Hcf);
    }


    public static void main(String[] args) {

        HCF(36,60);
    }
}
