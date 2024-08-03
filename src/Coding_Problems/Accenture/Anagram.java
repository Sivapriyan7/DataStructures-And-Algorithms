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

    public static boolean isAnagram2(String s1,String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }
        int[] arr = new int[26];
        for (int i=0; i<s1.length(); i++)
        {
//            System.out.println(s1.charAt(i)-'a');
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        for (int i=0; i<26; i++)
        {
            if(arr[i]!=0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "angram";
        String str2 = "ngaram";
        System.out.println(isAnagram(str1,str2));
        System.out.println(isAnagram2(str1,str2));
    }
}
