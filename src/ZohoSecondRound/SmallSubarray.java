package ZohoSecondRound;

import java.util.*;
//https://www.youtube.com/watch?v=aFZODME3Ih8

public class SmallSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Big Array ");
        int big = sc.nextInt();
        System.out.println("Enter the size of Small Array");
        int small = sc.nextInt();
        List<Integer> Big_arr = new ArrayList<>();
        List<Integer> Small_arr = new ArrayList<>();

        System.out.println("Enter big array ");
        for (int i=0; i<big; i++)
        {
            Big_arr.add(sc.nextInt());
        }
        System.out.println("Enter small array ");
        for (int i=0; i<small; i++)
        {
            Small_arr.add(sc.nextInt());
        }
        int[] result = new int[small];
        boolean sub_arr = false;
        for(int i=0; i<big; i++)
        {
            int start_index = i, end_index = i+small-1; int index = 0;
            boolean flag = true;
            if (i+small <= big) {
                for (int j = i; j < i + small; j++)
                {
                    if(Small_arr.contains(Big_arr.get(j)))
                    {
                        result[index++] = Big_arr.get(j);
                    }
                    else
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                {
                    sub_arr = true;
                    System.out.println("From Index "+start_index+" to "+end_index+ Arrays.toString(result));
                }
            }

        }
        if (!sub_arr)
        {
            System.out.println("No Matching Subarrays found!!!");
        }


    }
}
