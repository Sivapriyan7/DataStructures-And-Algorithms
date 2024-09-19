package TypeCasting;

import javax.xml.transform.Source;

public class TypeCasting {

    public static void main(String[] args) {

        //Integer to Character
        int in_num = 2;
        char ch_num = (char) (in_num+'0');
        System.out.println(ch_num);

        //Character to Integer
        in_num =  ch_num-'0';
        System.out.println(in_num+2);
//-----------------------------------------------------------------------------------------------------------------------------------
        //Character to String
        char ch_val = 'A';
        String str_val = Character.toString(ch_val);
        System.out.println(str_val);

        //String to Character
        String str_val1 = "A";
        char ch_val1 = str_val1.charAt(0);
        System.out.println(ch_val1);
//------------------------------------------------------------------------------------------------------------------------------------
        //Integer to String
        int in_val2 = 21324;
        String str_val2 = Integer.toString(in_val2);
        System.out.println(str_val2+1);

        //String to Integer
        String str_val3 = "332434";
        int in_val3 = Integer.parseInt(str_val3);
        System.out.println(in_val3+1);
    }
}


class IntToChar {
    public static void main(String[] args) {
        int intValue = 65; // Example integer
        char charValue = (char) intValue;

        System.out.println("The char value of " + intValue + " is: " + charValue);
    }
}
