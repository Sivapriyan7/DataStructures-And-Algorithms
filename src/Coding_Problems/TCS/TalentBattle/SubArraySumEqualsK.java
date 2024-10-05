package Coding_Problems.TCS.TalentBattle;

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
            int target = sc.nextInt();
//            System.out.println("target "+target);
            int sub_arr_sum = 0;
            int count=0;
            for (int i=0; i<arr.length; i++)
            {
                for (int j=i; j<arr.length; j++)
                {
                    sub_arr_sum = 0;
                    for (int k=i; k<=j; k++)
                    {
//                      System.out.print(arr[k]+" ");
                        sub_arr_sum+= arr[k];
                    }
                    if(sub_arr_sum==target)
                    {
                        count++;
                        for (int k=i; k<=j; k++)
                        {
                            System.out.print(arr[k]+" ");
                            sub_arr_sum+= arr[k];
                        }
                        System.out.println();
                    }
                }
            }
            System.out.println("Count "+count);
        }
    }

}
