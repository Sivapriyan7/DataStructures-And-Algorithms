package Coding_Problems.Accenture;

import java.util.ArrayList;
import java.util.Arrays;

public class reArrangeArray {

    public static int[] reArrange(int[] arr)
    {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int n:arr)
        {
            if (n > 0) {
                positive.add(n);
            }
            else {
                negative.add(n);
            }
        }
        int[] result = new int[arr.length];
        int index = 0;
        int count = 0;
        while (count < positive.size())
        {
            result[index] = positive.get(count);
            result[index+1] = negative.get(count);
            index+=2;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,-1,-2,-3};
        System.out.println(Arrays.toString(reArrange(arr)));
    }
}
