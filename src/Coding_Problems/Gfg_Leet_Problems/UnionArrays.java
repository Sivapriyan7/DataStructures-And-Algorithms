package Coding_Problems.Gfg_Leet_Problems;

import java.util.ArrayList;

public class UnionArrays {

    public static ArrayList<Integer> findUnion(int arr[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> unionList = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(arr[i] <= arr2[j])
            {
                if(unionList.size()==0 || unionList.get(unionList.size()-1) != arr[i])
                {
                    unionList.add(arr[i]);
                }
                i++;
            }
            else
            {
                if(unionList.size()==0 || unionList.get(unionList.size()-1) != arr2[j])
                {
                    unionList.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n)
        {
            if(unionList.size()==0 ||unionList.get(unionList.size()-1)!=arr[i])
            {
                unionList.add(arr[i]);
            }
            i++;
        }
        while (j<m)
        {
            if(unionList.size()==0 ||unionList.get(unionList.size()-1)!=arr2[j])
            {
                unionList.add(arr2[j]);
            }
            j++;
        }
        return unionList;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,2,3,5,6};
        System.out.println(findUnion(arr,arr2,5,5));
    }
}
