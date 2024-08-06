package wipro.FlowcontrolStatements;

public class alphabetuppercase {
    public static void main(String[] args) {
        char ch = 'a'; // Initialize with a lowercase letter
        // char ch = 'A'; // Initialize with an uppercase letter

        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        }
    }
}


