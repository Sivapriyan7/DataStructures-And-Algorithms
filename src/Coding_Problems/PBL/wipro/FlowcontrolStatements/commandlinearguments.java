package wipro.FlowcontrolStatements;


public class commandlinearguments {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            // Print all values separated by comma
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i != args.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
