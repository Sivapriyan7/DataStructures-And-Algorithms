package Coding_Problems.Accenture;

public class IndexOfString {

    public static int findIndexofString(String str1,String str2)
    {
        return str1.indexOf(str2);
    }

    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "world";
        System.out.println(findIndexofString(str1,str2));
    }
}
