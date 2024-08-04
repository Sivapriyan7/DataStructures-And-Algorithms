package Coding_Problems.Accenture;

import java.util.HashMap;

public class ElementFrequency {

    public static void elementFrequency(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int n:arr)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        int[] arr = {1,23,3,34,33,3};
        elementFrequency(arr);
    }
}
