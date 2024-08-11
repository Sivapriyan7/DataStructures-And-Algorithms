package Coding_Problems.Accenture;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class StringTransformationCost {

    public static int findCost(String s1,String s2)
    {
        ArrayList<Character> charlist = new ArrayList<>();
        for (int i=0; i<s1.length(); i++)
        {
            charlist.add(s1.charAt(i));
        }
        int cost_count = 0;
        System.out.println(charlist);
        for (int i=0; i<s2.length(); i++)
        {
            if(!(charlist.contains(new Character(s2.charAt(i)))));
            {
                cost_count++;
            }
        }
        return cost_count;
    }

    public static void main(String[] args) {
        String s1 = "ABD";
        String s2 = "AABCCD";
        System.out.println(findCost(s1,s2));
    }
}
