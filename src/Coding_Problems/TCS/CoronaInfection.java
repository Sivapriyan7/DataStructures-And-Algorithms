package Coding_Problems.TCS;

import java.util.Scanner;

public class CoronaInfection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,n;
        long sum;
        t = sc.nextInt();
        while (t-->0)
        {
            n = sc.nextInt();
            n--;
            sum = (n*(n+1))/2;
            System.out.println(sum);
        }
    }
}
