package wipro.FlowcontrolStatements;

public class maleorfemale {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java InterestCalculator <gender> <age>");
            return;
        }

        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        double percentageOfInterest = 0.0;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                percentageOfInterest = 8.2;
            } else if (age >= 59 && age <= 100) {
                percentageOfInterest = 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                percentageOfInterest = 8.4;
            } else if (age >= 59 && age <= 100) {
                percentageOfInterest = 10.5;
            }
        } else {
            System.out.println("Invalid gender entered. Please enter 'Male' or 'Female'.");
            return;
        }

        System.out.println("Percentage of interest for " + gender + " with age " + age + " is: " + percentageOfInterest + "%");
    }
}

