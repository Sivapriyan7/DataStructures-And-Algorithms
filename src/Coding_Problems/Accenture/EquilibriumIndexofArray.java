package Coding_Problems.Accenture;

import java.util.Arrays;

public class EquilibriumIndexofArray {

    public static int FindEquilibrium(int[] arr)
    {
        int leftsum = 0;
        int totalsum = 0;
        totalsum = Arrays.stream(arr).sum();
        for (int i=0; i<arr.length; i++)
        {
            totalsum -= arr[i];

            if(leftsum==totalsum)
            {
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 2, 2, 2};
        int n = arr.length;

        int result = FindEquilibrium(arr);
        System.out.println("Equilibrium index: " + result);

    }
}
