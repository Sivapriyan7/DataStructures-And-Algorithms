package Coding_Problems;

public class ReverseWords2 {

    public static String reverseWord(String str)
    {
        int left = 0;
        str+=" ";
        int right = str.length()-1;

        String temp = "";
        String ans = "";

        while (left <= right)
        {
            if(str.charAt(left) != ' ')
            {
                temp += str.charAt(left);
            }
            else if(str.charAt(left) == ' ')
            {
//                System.out.print(temp+" ");
                ans = temp+" "+ans;
                temp="";
            }
            left++;
        }
        return ans;
    }


    public static void main(String[] args) {
        String s = "TUF is great for interview preparation";

        System.out.println(reverseWord(s));
    }
}
