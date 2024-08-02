package Coding_Problems.Accenture;

import java.util.Arrays;

class MinSwapSelectionSort {

    public static void main(String[] args) {
        int[] nums = {12,2,45,21,32};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        int swapcount = 0;
        System.out.println("Before Sorting "+ Arrays.toString(nums));

        for(int i=0; i<size-1; i++)
        {
            minIndex = i;
            for (int j=i+1; j<size;j++)
            {
                if(nums[minIndex] > nums[j])
                {
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
                temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
                swapcount++;
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println("swaps required to sort the array : "+swapcount);
        System.out.println("After Sorting "+Arrays.toString(nums));

    }
}
