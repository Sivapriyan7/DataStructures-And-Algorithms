package DataStructures_Algorithms.Sorting_Algorithms;

import java.util.Arrays;

//https://www.youtube.com/watch?v=QN9hnmAgmOc

public class QuickSort {

    private static void quickSort(int[] arr, int low, int high) {

        if(low<high)
        { 
            int part = partition(arr,low,high);
            quickSort(arr,low,part-1);
            quickSort(arr,part+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j=low;j<high;j++)
        {
            if(arr[j] < pivot)
            {
                i++; //THE ARRAY VALUE TILL THE INDEX i ARE LESS THAN PIVOT
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {9,7,6,5,3,2,1};
        System.out.println("Before Sorting "+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting "+Arrays.toString(arr));

    }



}
