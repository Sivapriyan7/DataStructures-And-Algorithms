package Coding_Problems.TCS;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while(test_case-->0)
        {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i=0; i<arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            int sub_arr_sum = 0;
            for (int i=0; i<arr.length; i++)
            {
                for (int j=i; j<arr.length; j++)
                {
                    for (int k=i; k<=j; k++)
                    {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }

}
