package Coding_Problems;

import java.util.HashMap;

public class LongestDistinctCharacters {

    static int longestSubstrDistinctChars(String S){

        HashMap<Character,Integer> map = new HashMap<>();
        int left=0,right=0,maxlen=0;
        for (right=0;right<S.length();right++)
        {
            if (map.containsKey(S.charAt(right)))
            {
                left = (map.get(S.charAt(right))+1)>left ? map.get(S.charAt(right))+1:left;
                map.put(S.charAt(right),right);
            }
            else
            {
                map.put(S.charAt(right),right);
            }

            maxlen = (right-left+1)>maxlen ? right-left+1 : maxlen;
//            System.out.println(map+" "+maxlen);
            System.out.println("left:"+left+" right:"+right +" maxlen:"+maxlen);
        }
        System.out.println("left "+left);
        System.out.println("right "+right);
        return maxlen;
        }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestSubstrDistinctChars(s));
    }

}
