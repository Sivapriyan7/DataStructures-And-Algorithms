package Coding_Problems.Accenture;

import java.util.Arrays;

public class LargestNumberPerm {

    public static long LargestNum(int[] arr)
    {
        String str_num = "";
        for (int i=0; i<arr.length; i++)
        {
            str_num += Integer.toString(arr[i]);
        }
//        System.out.println("str"+str_num);
        int[] arr_num = new int[str_num.length()];
        for (int i=0;i<str_num.length();i++)
        {
            arr_num[i] = Character.getNumericValue(str_num.charAt(i));
        }
        Arrays.sort(arr_num);
        System.out.println(Arrays.toString(arr_num));


        long result = 0,Multiplier = 1;
        for (int i=0; i<arr.length; i++)
        {
//            System.out.println(arr_num[i]);
            result += arr_num[i] * Multiplier;
            System.out.println(result);
            Multiplier = Multiplier*10;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {2,3,4,5,9,2,2,2,4,1};

        System.out.println(LargestNum(num));
    }
}
