package Coding_Problems.Gfg_Leet_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class TWO_D_Array {

    public static void main(String[] args) {
        int [][] arr = new int[5][5];
        Scanner sc = new Scanner(System.in);
        for (int i=0 ;i<arr.length*arr.length; i++)
        {
            int row = i%arr.length;
            int col = i/arr.length;
            arr[row][col] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        for (int i=0 ;i<arr.length; i++)
        {
            for (int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
