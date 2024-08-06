package wipro.arrays;


public class oneorfour {
    public boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        oneorfour main = new oneorfour();
        int[] nums1 = {1, 4, 1, 4};
        int[] nums2 = {1, 4, 2, 4};
        int[] nums3 = {1, 1};
        System.out.println(main.only14(nums1)); // prints: true
        System.out.println(main.only14(nums2)); // prints: false
        System.out.println(main.only14(nums3)); // prints: true
    }
}

