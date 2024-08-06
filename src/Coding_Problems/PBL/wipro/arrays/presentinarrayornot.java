package wipro.arrays;

public class presentinarrayornot {
    public static void main(String[] args) {
        int[] nums = {1, 4, 34, 56, 7};
        int searchElement = 56;
        int result = findElement(nums, searchElement);
        System.out.println(result);
    }

    public static int findElement(int[] nums, int searchElement) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }
}
