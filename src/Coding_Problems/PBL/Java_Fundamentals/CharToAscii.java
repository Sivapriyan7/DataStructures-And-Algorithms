package Coding_Problems.PBL.Java_Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class CharToAscii {

    public static void charToAscii(String s1,String s2)
    {
        char[] charstr1 = s1.toCharArray();
        char[] charstr2 = s2.toCharArray();
        ArrayList<Character> charlist = new ArrayList<>();
        for (char c:charstr1)
        {
            charlist.add(c);
        }
        for (char c :charstr2)
        {
            if(charlist.contains(c));
            {
                System.out.println(c);
                charlist.remove(c);
            }
        }
        System.out.println(charlist);

    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bc";
        charToAscii(s1,s2);
    }
}
