package Coding_Problems.Accenture;

import java.util.Arrays;

public class MissingNumber {

    public static int findMissing(int[] arr)
    {
        int n = arr.length+1;
        int Total_sum = (n*(n+1))/2;
        int arr_sum = 0;
        int Total_sum1 = Arrays.stream(arr).sum();
        for (int i=0; i<arr.length; i++)
        {
           arr_sum += arr[i];
        }
        return Total_sum-arr_sum;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7};
        System.out.println(findMissing(arr));
    }

}
