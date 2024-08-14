package ZohoSecondRound;

public class LargeNumberAddition {
    public static String addLargeNumbers(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Make both strings of equal length by padding with leading zeros
        int lengthDiff = Math.abs(a.length() - b.length());
        if (a.length() < b.length()) {
            a = "0".repeat(lengthDiff) + a;
        } else {
            b = "0".repeat(lengthDiff) + b;
        }

        // Add digits from right to left
        for (int i = a.length() - 1; i >= 0; i--) {
            int digitA = a.charAt(i) - '0';
            int digitB = b.charAt(i) - '0';
            int sum = digitA + digitB + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        // If there's a carry left, append it
        if (carry > 0) {
            result.append(carry);
        }

        // Reverse the result to get the final answer
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "3243245353434343434334232323";
        String b = "24353534234232323232323242";
        String sum = addLargeNumbers(a, b);
        System.out.println("Sum: " + sum);
    }
}
