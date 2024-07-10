public class star {
    public static void main(String args[])
    {
        int a = 5;
        for (int i=1;i<=a;i++)
        {
            if(i==1 || i==a)
            {
                for (int j=1;j<=a;j++)
                {
                    System.out.print("*");
                }
            }
            else {
                System.out.println("");
            }
        }

    }
}
