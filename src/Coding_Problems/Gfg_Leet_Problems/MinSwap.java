import java.util.Scanner;

 class MinSwapsToGroupChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String S = scanner.nextLine();
        char K = scanner.nextLine().charAt(0);
        scanner.close();

        // Function call to find minimum swaps
        int result = minSwapsToGroupK(S, K);
        System.out.println(result);
    }

    public static int minSwapsToGroupK(String S, char K) {
        int n = S.length();
        int countK = 0;

        // Count occurrences of K
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == K) {
                countK++;
            }
        }

        if (countK == 0) {
            return 0; // If there are no K's, no swaps are needed
        }

        int maxKInWindow = 0;
        int currentKInWindow = 0;

        // Sliding window approach
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == K) {
                currentKInWindow++;
            }
            if (i >= countK) {
                if (S.charAt(i - countK) == K) {
                    currentKInWindow--;
                }
            }
            if (i >= countK - 1) {
                maxKInWindow = Math.max(maxKInWindow, currentKInWindow);
            }
        }

        // Minimum swaps required
        return countK - maxKInWindow;
    }
}
