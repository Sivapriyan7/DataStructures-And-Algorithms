package Coding_Problems.Gfg_Leet_Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StudentRank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] stud_mark = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                stud_mark[i][j] = sc.nextInt();
            }
        }
        Integer total_mark[] = new Integer[5];
        int copy_mark[] =  new int[5];
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += stud_mark[i][j];
            }
            total_mark[i] = sum;
            copy_mark[i] = sum;
        }
        System.out.println(Arrays.toString(total_mark));
        Arrays.sort(total_mark,Collections.reverseOrder());
//        System.out.println(Arrays.toString(total_mark));

        for (int i=0; i<5 ;i++)
        {
            for (int j=0; j<5; j++)
            {
                if(total_mark[i]==copy_mark[j])
                {
                    copy_mark[j] = i+1;
                }
            }
        }
        System.out.println(Arrays.toString(copy_mark));

    }
}
