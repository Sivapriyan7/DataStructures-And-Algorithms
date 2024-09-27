package Coding_Problems.TCS;

public class NumberPlate {

    public static int decreaseval(int val)
    {
        int num = 0;
        while (val>0)
        {
            num += val%10;
            val /= 10;
        }
        return num;
    }

    public static void main(String[] args) {

        String num = "TN 29 CE 9999";

        int val = 0;
        for (int i=num.length()-4; i<num.length(); i++)
        {
            val = (val*10) + num.charAt(i)-'0';
        }
        //System.out.println(val);
        while (val>10)
        {
            val = decreaseval(val);
        }

        System.out.println(val);
        if(val%2==0)
        {
            System.out.println("Lucky Number");
        }
        else
        {
            System.out.println("Not a Lucky Number");
        }
    }
}
