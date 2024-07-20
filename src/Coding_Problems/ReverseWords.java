package Coding_Problems;


import java.util.ArrayList;

class Solution
{
    //Function to reverse words in a given string.
    static String reverseWords(String S)
    {
        // code here
        ArrayList<String> List = new ArrayList<>();

        int prevlen = 0;
        int i;
        for(i=0; i<S.length(); i++)
        {
            if(S.charAt(i)=='.')
            {
                List.add(S.substring(prevlen,i));
                prevlen = i+1;
            }
        }
        List.add(S.substring(prevlen,i));

        StringBuilder reversedWords = new StringBuilder();
        for (int j=List.size()-1; j>=0; j--)
        {
            reversedWords.append(List.get(j));
            reversedWords.append('.');
        }
        reversedWords.deleteCharAt(reversedWords.length()-1);
    return reversedWords.toString();
    }

    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));

    }
}