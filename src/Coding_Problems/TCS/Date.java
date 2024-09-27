package Coding_Problems.TCS;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;
import java.util.HashMap;

public class Date {

    public static void main(String[] args) {
        String date = "23rd june 1998";
        String[] str_date = date.split(" ");

        HashMap<String,Integer> months = new HashMap<>();

        months.put("january",1);
        months.put("february",2);
        months.put("march",3);
        months.put("april",4);
        months.put("may",5);
        months.put("june",6);
        months.put("july",7);
        months.put("august",8);
        months.put("september",9);
        months.put("october",10);
        months.put("november",11);
        months.put("december",12);
        for (int i=0; i<date.length(); i++)
        {
            if(date.charAt(i)-'0'>=0 && date.charAt(i)-'0'<=9)
            {
                System.out.println(date.charAt(i));
            }
        }

        str_date[1] = (months.get(str_date[1]).toString());
        int sum = 0;
        System.out.println(Arrays.toString(str_date));
        for (int i=0; i< str_date.length; i++)
        {
            String s = str_date[i];
//            System.out.println(s);
            for(int j=0; j<s.length(); j++)
            {
                if(Character.isDigit(s.charAt(j)))
                {
//                    System.out.println(s.charAt(j));
                    sum += s.charAt(j)-'0';
                }
            }
        }
        System.out.println(sum);
        if(sum%2==0)
        {
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Un Lucky Number");
        }
    }

}
