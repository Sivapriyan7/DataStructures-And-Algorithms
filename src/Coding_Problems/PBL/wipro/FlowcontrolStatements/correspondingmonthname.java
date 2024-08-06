package wipro.FlowcontrolStatements;



import java.util.Scanner;

public class correspondingmonthname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Please enter the month in numbers:");
            int month = scanner.nextInt();
            scanner.close();
            System.out.println(getMonthName(month));
        } else {
            int month = Integer.parseInt(args[0]);
            System.out.println(getMonthName(month));
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (month < 1 || month > 12) {
            return "Invalid month";
        }
        return monthNames[month - 1];
    }
}

