package Coding_Problems.PBL.Java_Fundamentals;

// Program to illustrate the
// remove(int index) method

import java.util.*;

public class GFG {
    public static void main(String[] args)
    {

        // Declare an empty List of size 5
        List<Character> list = new ArrayList<Character>(5);

        // Add elements to the list
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        // Element needed to be removed
        char c = 'a';

        // Initial list
        System.out.println("Initial List: " + list);

        // remove element
        list.remove(c);

        // Final list
        System.out.println("Final List: " + list);
    }
}

