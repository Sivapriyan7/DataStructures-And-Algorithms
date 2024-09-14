package Coding_Problems.Gfg_Leet_Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class str {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rings = sc.nextLine();
        HashMap<Integer,Set<Character>> map= new HashMap<>();
        for(int i=1; i<rings.length(); i+=2)
        {
            int rod = Character.getNumericValue(rings.charAt(i));
            char ring = rings.charAt(i-1);

            map.putIfAbsent(rod,new HashSet<>());
            map.get(rod).add(ring);
        }
        System.out.println(map);
        for (Integer key : map.keySet()) {
            if(map.get(key).size()==3)
            {

            }
        }
    }
}
