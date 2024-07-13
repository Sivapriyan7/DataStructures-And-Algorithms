package PatternPrinting;

public class Patterns {
    public static void main(String[] args) {
//        pattern28(5);
//        pattern29(5);
//        patternChar(5);
        pattern20(5);
    }


//            *****
//            *****
//            *****
//            *****
//            *****
    public static void pattern1(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int col=1; col<n; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n)
    {
        for (int row = 0; row < n; row++) {
            for (int col=0; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n)
    {
        for (int row = 1; row <= n; row++)
        {
            for (int col=1; col<=n-row+1; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n)
    {
        for (int row = 1;row <= n; row++)
        {
            for (int col = 1;col <= row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n)
    {
        for (int row=1; row<=2*n-1; row++)
        {
            int cols = row>=n ? 2*n-row: row;
            for (int col=1; col<=cols; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n)
    {
        for (int row=1; row<=n; row++)
        {
            for (int col=1; col<=n; col++)
            {
                if(col <= n-row)
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern7(int n)
    {
        for (int row=n; row>=1; row--)
        {
            for (int col=1; col<=n-row; col++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=row; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n)
    {
        for (int row=1; row<=n; row++)
        {
            for (int col=1; col<=n-row+1; col++)
            {
                System.out.print(" ");
            }
            for (int i=1; i<=row*2-1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n)
    {
        for(int row=n; row>=1; row--)
        {
            for (int col=1; col<=n-row; col++)
            {
                System.out.print(" ");
            }
            for (int i=1; i<=row*2-1;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print(" ");
            }
            for (int i=1; i<=row; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n)
    {
        for(int row=n; row>=1; row--)
        {
            for (int col=1; col<=n-row; col++)
            {
                System.out.print(" ");
            }
            for (int i=1;i<=row; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternChar(int n)
    {
        char currentChar = 'A';
        for (int row=1;row<=n;row++)
        {
            for (int col=1; col<=row; col++)
            {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
        }
    }

    public static void pattern28(int n)
    {
        for (int row=1; row<=n*2-1; row++)
        {
            int cols = row<n ? n-row:row-n;
            for (int col=1; col<=cols; col++)
            {
                System.out.print(" ");
            }
            int star = row<=n ? row: n*2-row;
            for (int i=1; i<=star; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern29(int n)
    {
        for (int row=1; row<=n*2-1; row++)
        {
            int cols = row<n ? n-row:row-n;
            for (int col=1; col<=cols; col++)
            {
                System.out.print(" ");
            }
            int star = row<=n ? row: n*2-row;
            for (int i=1; i<=star; i++)
            {
                if(i==1 || i==star)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern20(int n)
    {
        for (int row=1; row<=n; row++)
        {
            for (int col=1; col<=n-row; col++)
            {
                System.out.print("  ");
            }
            for (int i=1; i<=row*2-1; i++)
            {
                if (i<=row)
                {
                    System.out.print(row-i+1+" ");
                }
                else {
                    System.out.print(i-row+1  +" ");
                }
            }
            System.out.println();
        }
    }
}

