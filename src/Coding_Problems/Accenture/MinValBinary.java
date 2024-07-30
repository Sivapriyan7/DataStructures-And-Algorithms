package Coding_Problems.Accenture;

import java.util.Scanner;

public class MinValBinary {

    public static int MinValBinary(int num){
        int count = 0;
        while (num>0)
        {
            int c = num&1;
            if(c==1)
            {
                count++;
            }
            num = num>>1;
        }

        int ans = 0,power=1;
        for (int i=0; i<count; i++)
        {
            ans += power*1;
            power *= 2;
        }
        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(MinValBinary(num));
        byte x = 127;
        x++;
        x++;
        System.out.println(x);

    }
}
