package wipro.arrays;



public class sixandseveninsucceeding {
    public static void main(String[] args) {
        int[] nums1 = {10, 3, 6, 1, 2, 7, 9};
        int[] nums2 = {7, 1, 2, 3, 6};
        int[] nums3 = {1, 6, 4, 7, 9};

        System.out.println(sumIgnoringBetween6And7(nums1)); // prints: 22
        System.out.println(sumIgnoringBetween6And7(nums2)); // prints: 19
        System.out.println(sumIgnoringBetween6And7(nums3)); // prints: 10
    }

    public static int sumIgnoringBetween6And7(int[] nums) {
        int sum = 0;
        boolean ignore = false;

        for (int num : nums) {
            if (num == 6) {
                ignore = true;
            } else if (num == 7) {
                ignore = false;
            } else if (!ignore) {
                sum += num;
            }
        }

        return sum;
    }
}


