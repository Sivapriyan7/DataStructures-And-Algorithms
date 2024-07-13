package DataStructures_Algorithms;

import java.util.Arrays;
//https://www.youtube.com/watch?v=yCxV0kBpA6M

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {12, 2, 45, 21, 32};
        int size = arr.length;
        int temp = 0;
        int key = 0;
        System.out.println("Before Sorting " + Arrays.toString(arr));

        for (int i = 1; i < size; i++)
        {
            key = arr[i];
            int j = i-1;
//            System.out.println(j);
            while (j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("After Sorting "+Arrays.toString(arr));
    }
}
