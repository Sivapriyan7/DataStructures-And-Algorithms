package Coding_Problems.Gfg_Leet_Problems;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        TreeMap<Integer,Integer> sortedMap=new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sortedMap.put(arr[i],sortedMap.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:sortedMap.entrySet())
        {
            if(entry.getValue()>1)
                ans.add(entry.getKey());
        }
        return ans.isEmpty() ? new ArrayList<>(List.of(-1)) : ans;
    }
}