import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        int n1, n2;
        Scanner s = new Scanner(System.in);

        System.out.println("enter two numbers ");
        n1 = s.nextInt();
        n2 = s.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i == 1 || i==0) {
                continue;
            }
            int count = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i%j==0) {
                    count = 0;
                    break;
                }
            }

            if (count==1){
                System.out.println(i);
            }


        }

    }
}

