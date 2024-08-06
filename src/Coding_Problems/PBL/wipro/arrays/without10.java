package wipro.arrays;


import java.util.Arrays;

public class without10 {
    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num != 10) {
                result[index++] = num;
            }
        }
        while (index < nums.length) {
            result[index++] = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        without10 main = new without10();
        int[] nums1 = {1, 10, 10, 2};
        int[] nums2 = {10, 2, 10};
        int[] nums3 = {1, 99, 10};
        System.out.println(Arrays.toString(main.withoutTen(nums1))); // prints: [1, 2, 0, 0]
        System.out.println(Arrays.toString(main.withoutTen(nums2))); // prints: [2, 0, 0]
        System.out.println(Arrays.toString(main.withoutTen(nums3))); // prints: [1, 99, 0]
    }
}


