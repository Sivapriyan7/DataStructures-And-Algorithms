package DataStructures_Algorithms;

import java.util.Arrays;

public class LinearBinarySearch {

    public static void main(String[] args) {
        int[] nums = {2,3,4,6,9,12,34,56,78};
        int target = 78;

        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);

        if (result1 != -1)
        {
            System.out.println("Element found at index "+result1);
        }
        else {
            System.out.println("Element Not Found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i=0; i<nums.length; i++)
        {
            steps++;
            if(nums[i] == target)
            {
                System.out.println("Steps taken by linear : "+steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear : "+steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
//        System.out.println(end);
//        System.out.println(Arrays.toString(nums));
        int steps = 0;


        while (start<=end)
        {
            steps++;
            int mid = (start+end)/2;
            if(nums[mid] == target)
            {
                System.out.println("Steps taken by binary : "+steps);
                return mid;
            }
            else if (nums[mid] < target)
            {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        System.out.println("Steps taken by binary : "+steps);
        return -1;
    }

}
