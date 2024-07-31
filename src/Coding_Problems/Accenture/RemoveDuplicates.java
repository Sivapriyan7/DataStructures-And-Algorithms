package Coding_Problems.Accenture;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr)
    {
        int p1 = 1;
        for (int i=1; i<arr.length; i++)
        {
            if(arr[i] != arr[i-1])
            {
                arr[p1] = arr[i];
                p1++;
            }
        }
        int[] unq_arr = new int[p1];
        for (int j=0; j<p1; j++)
        {
            unq_arr[j] = arr[j];
        }
        return unq_arr;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,3,3,4,5,5,6};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
