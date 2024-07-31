package Coding_Problems.Accenture;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1,str2) ? true :false;
    }

    public static void main(String[] args) {
        String str1 = "helo";
        String str2 = "oleh";
        System.out.println(isAnagram(str1,str2));
    }
}
