package wipro.FlowcontrolStatements;


public class positiveornegativeorzero {

    public static void main(String[] args) {
        int number = -15; // Example number to check

        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}

//public class LastDigitCheck {
//
//    public static void main(String[] args) {
//        int a = 27; // Example numbers
//        int b = 57;
//
//        boolean result = lastDigit(a, b);
//        System.out.println("lastDigit(" + a + ", " + b + ") → " + result);
//    }
//
//    public static boolean lastDigit(int a, int b) {
//        return (a % 10 == b % 10);
//    }
//}
