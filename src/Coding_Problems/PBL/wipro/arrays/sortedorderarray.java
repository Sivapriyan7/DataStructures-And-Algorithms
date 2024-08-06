package wipro.arrays;

import java.util.Arrays;

public class sortedorderarray {
    public static void main(String[] args) {
        int[] nums = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}

