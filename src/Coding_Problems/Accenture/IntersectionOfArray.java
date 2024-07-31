package Coding_Problems.Accenture;

import java.util.Arrays;

public class IntersectionOfArray {

    public static int[] findIntersection(int[] arr1, int[] arr2)
    {
        int s_arr1 = arr1.length;
        int s_arr2 = arr2.length;
        int i=0,j=0;
        int max_size = s_arr1 >= s_arr2 ? s_arr1 : s_arr2;
        int[] intersection = new int[max_size];
        int count = 0;
        while (i<s_arr1 && j<s_arr2)
        {
            if(arr1[i] < arr2[j])
            {
                i++;
            }
            else if (arr2[j] < arr1[i])
            {
                j++;
            }
            else {
                intersection[count++] = arr1[i];
                i++;
                j++;
            }
        }
        return intersection;

    }

    public static void main(String[] args) {

        int[] arr1 = {1,3,4,6,7,8};
        int[] arr2 = {0,3,4,5,7,8};

        System.out.println(Arrays.toString(findIntersection(arr1,arr2)));

    }

}
