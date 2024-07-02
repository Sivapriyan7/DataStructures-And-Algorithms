//public class Pallindrome {
//}
class Pallindrome {
    public boolean isPalindrome(int x) {

        int sum = 0,r,temp=x;
        while(x>0)
        {
            r = x%10;
            sum = sum*10 + r;
            System.out.println(sum);
            x = x/10;
            System.out.println(x);
        }
        System.out.println("temp"+temp);
        System.out.println("sum"+sum);
        if (temp == sum){return true;}
        else{return false;}
    }

    public static void main(String args[])
    {
        Pallindrome p = new Pallindrome();
        System.out.println(p.isPalindrome(121));
    }
}