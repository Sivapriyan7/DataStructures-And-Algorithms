package ZohoSecondRound;

import java.util.Arrays;

public class ArraySort2 {

    public static void sortarr(int[] A1, int[] A2)
    {
        int a1 = A1.length;
        int a2 = A2.length;
        for(int i=0; i<a1; i++)
        {
            for (int j=0; j<a2; j++)
            {
                if(A1[i] > A2[j])
                {
                    int temp = A1[i];
                    A1[i] = A2[j];
                    A2[j] = temp;
                }
            }
        }
        for (int i=0; i<a2; i++)
        {
            for (int j=0; j<a2-i-1; j++)
            {
                if(A2[j]>A2[j+1])
                {
                    int temp = A2[j];
                    A2[j] = A2[j+1];
                    A2[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(A1));
        System.out.println(Arrays.toString(A2));
    }

    public static void main(String[] args) {
        int[] A1 = {2,4,6,8};
        int[] A2 = {1,3,5,7};
        sortarr(A1,A2);
    }
}
