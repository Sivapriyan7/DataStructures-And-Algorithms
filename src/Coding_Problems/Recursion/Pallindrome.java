package Coding_Problems.Recursion;

public class Pallindrome {
    public static void main(String[] args) {
        String str = "hoh";
        System.out.println(isPallindrome(str,0,str.length()-1));
    }
    public static boolean isPallindrome(String str,int start,int end)
    {
        if(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            isPallindrome(str,start+1,end-1);
        }
        return true;
    }
}
