package Coding_Problems.Accenture;

public class BitWiseOperations {

    public static String BitwiseAND(String s1,String s2)
    {
        String result = "";
        for (int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i)=='1' && s2.charAt(i)=='1')
            {
                result += '1';
            }
            else {
                result += '0';
            }
        }
        return result;
    }

    public static String BitwiseOR(String s1,String s2)
    {
        String result = "";
        for (int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i) == '1' || s2.charAt(i) == '1')
            {
                result += '1';
            }
            else {
                result += '0';
            }
        }
        return result;
    }

    public static String BitwiseXOR(String s1,String s2)
    {
        String result = "";
        for (int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                result += '1';
            }
            else {
                result += '0';
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "101010";
        String s2 = "011100";

        System.out.println(BitwiseAND(s1,s2));
        System.out.println(BitwiseOR(s1,s2));
        System.out.println(BitwiseXOR(s1,s2));

    }



}
