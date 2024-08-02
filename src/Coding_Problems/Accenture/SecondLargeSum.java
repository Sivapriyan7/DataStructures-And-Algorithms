package Coding_Problems.Accenture;

import java.util.Arrays;

public class SecondLargeSum {

    public static int SecondLargeSum(int[] arr)
    {
        Arrays.sort(arr);
        return arr[2]+arr[3];
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,7,5,4};//even vals 3 1 5   - 3
                                  //odd  vals 2 7 4   - 4

        System.out.println(SecondLargeSum(arr));

    }
}
