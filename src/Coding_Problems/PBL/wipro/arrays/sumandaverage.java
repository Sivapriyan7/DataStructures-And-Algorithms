package wipro.arrays;

public class sumandaverage {
    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 23, 56, 89, 34};

        int sum = calculateSum(nums);
        double average = calculateAverage(nums, sum);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public static int calculateSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] nums, int sum) {
        return (double) sum / nums.length;
    }
}

