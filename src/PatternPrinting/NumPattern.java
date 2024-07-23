package PatternPrinting;

public class NumPattern {

    public static void main(String[] args) {
        for (int i=0; i<3; i++)
        {
            for (int j=i; j<4+i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
