package wipro.FlowcontrolStatements;

public class charactervariable {

    public static void main(String[] args) {
        char ch = '7'; // Initialize character variable

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
