package DataStructures_Algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {12,2,45,21,32};
        int size = nums.length;
        int temp = 0;
        System.out.println("Before Sorting "+Arrays.toString(nums));

        for(int i=0;i<size;i++){
            for (int j=0;j<size-i-1;j++)
            {
                if(nums[j] >nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("After Sorting "+Arrays.toString(nums));

    }
}
