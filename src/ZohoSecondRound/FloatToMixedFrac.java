import java.util.zip.DeflaterOutputStream;

public class FloatToMixedFrac {
    public int findGcd(int a,int b)
    {
        while (b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public String FloatToMixed(double num)
    {
        int WholeVal = (int)num;
        double Decimalval = num - WholeVal;

        if (Decimalval == 0)
        {
            return String.valueOf(WholeVal);
        }
        int Denominator = 1;
        while(Decimalval != Math.floor(Decimalval))
        {
            Decimalval *= 10;
            Denominator *= 10;
        }
        int numerator = (int) Decimalval;
        int gcd = findGcd(numerator,Denominator);
        numerator /= gcd;
        Denominator /= gcd;

        return WholeVal+" "+numerator+"/"+ Denominator;
    }

    public static void main(String args[])
    {
        double DecimalVal = 2.5;
        FloatToMixedFrac fm = new FloatToMixedFrac();
        String finalVal = fm.FloatToMixed(DecimalVal);
        System.out.println("Output : "+finalVal);
    }
}
