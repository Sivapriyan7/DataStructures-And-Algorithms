package Coding_Problems.Accenture;

public class ReplaceString {

    public static String replace(String str,char c1,char c2)
    {
        String result = "";
        for (int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == c1)
            {
                result += c2;
            }
            else if (str.charAt(i) == c2)
            {
                result += c1;
            }
            else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "apple";
        System.out.println(replace(str,'a','p'));
    }

}
