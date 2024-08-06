package wipro.arrays;

import java.util.Arrays;

public class largestsmallest {
    public static void main(String[] args) {
        int[] nums = {12, 34, 45, 6, 78, 90, 23, 11};

        Arrays.sort(nums);

        System.out.println("Smallest 2 numbers: " + nums[0] + ", " + nums[1]);
        System.out.println("Largest 2 numbers: " + nums[nums.length - 1] + ", " + nums[nums.length - 2]);
    }
}


