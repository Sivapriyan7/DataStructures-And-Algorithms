package Coding_Problems.TCS.TalentBattle;

import java.util.Scanner;

public class BookCombination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mod = (int)1e8+7;
        long n,a=0,b=1,c=2,d=0;
        n = sc.nextLong();

        if(n==1 || n==2)
            System.out.println(n-1);
        else{
            for(int i=3 ; i<=n ; i++){
                d = (c * (a + b)) % mod ;
                a = b;
                b = d;
                c++;
            }
            System.out.println(d);
        }
    }
}
