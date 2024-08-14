package ZohoSecondRound;

public class a3d5 {

    public static void printString(String s1)
    {
        for (int i=0; i<s1.length(); i++)
        {
            if(Character.isLetter(s1.charAt(i)))
            {
                char c = s1.charAt(i);
                String times = "";
                while(i+1<s1.length() && Character.isDigit(s1.charAt(i+1)))
                {
                    times += Character.toString(s1.charAt(++i));
                }
                int loop_times = Integer.parseInt(times);
                for (int j=0;j<loop_times;j++)
                {
                    System.out.print(c);
                }
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "a3d4z12";
        printString(s1);
    }
}
