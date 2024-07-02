package ZohoSecondRound;

public class SquareRootofNum {
    public static void main(String[] args) {
        int num = 33;
        double val = 0;
        double Precision = 1;

        for(int i=1;i<=4;i++)
        {
            while (val*val < num)
            {
                val += Precision;
            }
            val -= Precision;
            Precision /= 10;
        }
        System.out.println("Square root "+val);
    }
}
