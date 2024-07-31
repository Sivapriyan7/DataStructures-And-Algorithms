package Coding_Problems.Accenture;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRC {

    public static int Longestsubstring(String str)
    {
        Set<Character> set = new HashSet<>();
        int left=0,maxLen=0;
        boolean flag=false;
        for (int right=0; right<str.length(); right++)
        {
            while(set.contains(str.charAt(right)))
            {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLen  = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {

        String str = "asddddddfsdfsfsfqw";
        System.out.println(Longestsubstring(str));
    }
}
