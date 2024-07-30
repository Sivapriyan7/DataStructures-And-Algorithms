package Coding_Problems.Accenture;

public class ReverseString {

    public static String reverseString(String str)
    {
        int left = 0;
        int right = str.length()-1;
        char[] str_arr = str.toCharArray();

        while (left<right){
            char temp = str_arr[left];
            str_arr[left] = str_arr[right];
            str_arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(str_arr);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));
    }
}
