package Coding_Problems;

public class MaximumSubarraySum {


    public static int MaxSubarrSum(int[] arr)
    {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int n : arr)
        {
            curr_sum += n;
            max_sum = Math.max(curr_sum,max_sum);
            if(curr_sum < 0)
            {
                curr_sum = 0;
            }
        }
        return max_sum;

    }

    public static void main(String[] args) {
        int[] arr = {-2,3,-4,3,-2,3,-4};
        System.out.println(MaxSubarrSum(arr));
    }


}
