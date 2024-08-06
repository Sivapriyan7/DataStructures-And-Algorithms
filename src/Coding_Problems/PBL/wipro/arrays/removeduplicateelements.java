package wipro.arrays;

import java.util.*;

public class removeduplicateelements {
    public static void main(String[] args) {
        int[] nums = {12, 34, 12, 45, 67, 89};
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Array without duplicates: " + Arrays.toString(removeDuplicates(nums)));
    }

    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }
        return result;
    }
}

