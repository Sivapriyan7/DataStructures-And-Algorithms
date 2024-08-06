package wipro.FlowcontrolStatements;

public class palindromeornot {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter a single number");
            return;
        }

        String num = args[0];
        boolean isPalindrome = isPalindrome(num);

        System.out.println(num + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
    }

    public static boolean isPalindrome(String num) {
        int start = 0;
        int end = num.length() - 1;

        while (start < end) {
            if (num.charAt(start) != num.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
