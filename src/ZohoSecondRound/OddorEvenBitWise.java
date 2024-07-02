package ZohoSecondRound;

import javax.sound.midi.Soundbank;

public class OddorEvenBitWise {
    public static boolean OddorEven(int n)
    {
        return (n&1)==0;
    }

    public static void main(String[] args) {
        int n = 1132;

        if (OddorEven(n))
        {
            System.out.println(n+" is Even Number");
        }
        else {
            System.out.println(n+" is odd Number");
        }
    }
}
