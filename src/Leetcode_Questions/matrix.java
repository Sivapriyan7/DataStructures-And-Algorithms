import java.util.Scanner;

public class matrix {

    public static void main(String args[])
    {
        int row,col;
        int [][] matrix1 = new int[10][10];
        Scanner r = new Scanner(System.in);

        row = r.nextInt();
        col = r.nextInt();

        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=col;j++)
            {
                matrix1[i][j] = r.nextInt();
            }
        }
        int sum=0;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=col;j++)
            {
                if (i==j)
                {
                 sum += matrix1[i][j];
                }
            }
        }

        System.out.println("sum "+sum);




    }
}
