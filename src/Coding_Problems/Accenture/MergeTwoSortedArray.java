package Coding_Problems.Accenture;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static int[] mergeArray(int[] arr1,int[] arr2)
    {
        int i = 0;
        int j = 0;
        int[] merged_array = new int[arr1.length+arr2.length];
        int count = 0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                merged_array[count++] = arr1[i];
                i++;
            }
            else if(arr2[j] <= arr1[i])
            {
                merged_array[count++] = arr2[j];
                j++;
            }
        }
        while (i<arr1.length)
        {
            merged_array[count++] = arr1[i];
            i++;
        }
        while (j<arr2.length)
        {
            merged_array[count++] = arr2[j];
            j++;
        }
     return merged_array;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4};
        int[] arr2 = {3};
        System.out.println(Arrays.toString(mergeArray(arr1,arr2)));
    }
}
