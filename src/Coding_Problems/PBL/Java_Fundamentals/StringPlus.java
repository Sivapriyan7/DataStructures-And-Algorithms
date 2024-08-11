package Coding_Problems.PBL.Java_Fundamentals;

import java.io.StringReader;

public class StringPlus {

    public static String stringplus(String s1)
    {
        StringBuilder sb = new StringBuilder();
        String[] strarr = s1.split(" ");
        for (String s: strarr)
        {
            int len = s.length();
            char[] chararr = s.toCharArray();
            for(int i=0; i<chararr.length; i++)
            {
                for (int j=0; j<len; j++)
                {
                    if(chararr[i]=='z'||chararr[i]=='Z')
                    {
                        break;
                    }
                    chararr[i]++;
                }
            }
            sb.append(chararr);
            sb.append(" ");
        }
        String result = sb.toString();
        return result.substring(0,result.length()-1);

    }

//    public static String stringplus2(String s)
//    {
//        String result = "";
//
//        for (int i=0; i<s.length(); i++)
//        {
//            result += cars.charAt(i)+3;
//        }
//
//        return result;
//    }


    public static void main(String[] args) {

        String s1 = "Hi Hello";
        System.out.println(stringplus(s1));

    }
}
