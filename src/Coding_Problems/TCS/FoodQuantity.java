package Coding_Problems.TCS;
import java.util.Scanner;

public class FoodQuantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int num = sc.nextInt();
        int temp = num;
        int total = row*col;

        if(num%row==0)
        {
            col = num/row;
        }
        else{
            col = (num/row)+1;
        }
        //col = col%2;

//        System.out.println("col "+col);
        if(row%2==1)
        {
            if(num%2==col%2)
            {
                System.out.println("Tree is plant");
            }
            else {
                System.out.println("Tree is not plant");
            }
        }
        else {
            if(num%2==0)
            {
                System.out.println("Tree is not plant");
            }
            else {
                System.out.println("Tree is plant");
            }
        }

    }
}
