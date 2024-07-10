public class cube {

    public static void main(String args[])
    {
        int a = 5;
        for (int i=1;i<=a;i++)
        {
            for (int j=1;j<=a;j++)
            {
                if (i==1 || i==a)
                {
                    System.out.print('*');
                }
                if (j==2 || j==3 || j==4)
                {
                    System.out.println("*");
                }
            }
            System.out.println();

        }

    }
}
