package ZohoSecondRound;

import java.util.ArrayList;

public class union_intersection {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,2,3,3,4,5,6};
        int[] arr2 = new int[]{2,3,3,5,6,6,7};

        ArrayList<Integer> s = union(arr1,arr2);

        System.out.println("Union of arr1,arr2 "+s);

    }

    public static ArrayList<Integer> union(int[] arr1, int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0,j=0;
        ArrayList<Integer> unionList = new ArrayList<>();

        while (i<n1 && j<n2)
        {
            if (arr1[i] <= arr2[j])
            {
                if(unionList.size()==0 || unionList.get(unionList.size()-1) != arr1[i])
                {
                    unionList.add(arr1[i]);
                }
                i++;
            }
            else {
                if(unionList.size()==0 || unionList.get(unionList.size()-1) != arr2[j])
                {
                    unionList.add(arr2[j]);
                }
                j++;
            }
        }
        while (j<n2)
        {
            if(unionList.size()==0 ||unionList.get(unionList.size()-1) != arr2[j])
            {
                unionList.add(arr2[j]);
            }
            j++;
        }
        while (i<n1)
        {
            if(unionList.size()==0 ||unionList.get(unionList.size()-1) != arr1[i])
            {
                unionList.add(arr1[i]);
            }
            i++;
        }
        return unionList;
    }

//    public
}
