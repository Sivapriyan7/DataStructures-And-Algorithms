package Coding_Problems.Recursion;


import java.util.ArrayList;
import java.util.Arrays;

public class SubsequenceOfArray {

    public static void PrintSubsSequence(int[] arr, ArrayList<Integer> list, int ind,int n)
    {
        if(ind==n)
        {
            System.out.println(list);
            return;
        }
        list.add(arr[ind]);
        PrintSubsSequence(arr,list,ind+1,arr.length);
        list.remove(list.size()-1);

        PrintSubsSequence(arr,list,ind+1,arr.length);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {3,1,2};
        PrintSubsSequence(arr,list,0,arr.length);

    }

}
