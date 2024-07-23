package Coding_Problems.PrepInsta100;

public class LeapYear {

    public static String LeapYearOrNot(int year)
    {
        if(year % 400 ==0)
        {
            return "Leap Year";
        }
        else if (year % 4 == 0 && year % 100 != 0 )
        {
            return "Leap Year";
        }
        else
        {
            return "Not a Leap Year";
        }
    }

    public static void main(String[] args) {

        int year = 3200;
        System.out.println(LeapYearOrNot(year));

    }
}
