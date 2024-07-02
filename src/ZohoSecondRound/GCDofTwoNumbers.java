package ZohoSecondRound;

public class GCDofTwoNumbers {
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
    public static void main(String[] args)
    {
        int a = 50,b = 60;
        GCDofTwoNumbers gcd = new GCDofTwoNumbers();
        int GCD = gcd.findGcd(a,b);
        System.out.println(GCD);
    }
}
