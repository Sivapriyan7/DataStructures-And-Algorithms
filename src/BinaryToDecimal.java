public class BinaryToDecimal {
    public static void main(String args[])
    {
        String s  = "1010";
        int sum = 0;
        int num ;
        for (int i = 0;i<s.length();i++)
        {
            if ((i==0)&&(s.charAt(i)=='1')){
                    sum += 8;
            }
            if ((i==1)&&(s.charAt(i)=='1')){
                    sum += 4;
            }
            if ((i==2) && (s.charAt(i)=='1')){
                    sum += 2;
            }
            if ((i==3)&& (s.charAt(i)=='1')) {
                    sum += 1;
            }
        }

        System.out.println(sum);

    }

}
