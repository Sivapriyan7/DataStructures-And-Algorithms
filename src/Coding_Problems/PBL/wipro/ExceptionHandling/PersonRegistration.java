package wipro.ExceptionHandling;

public class PersonRegistration {
    public static void main(String[] args) {
        // Check if exactly 2 arguments are provided
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two arguments - name and age.");
            System.exit(1); // Exit the program with an error code
        }

        String name = args[0];
        String ageString = args[1];

        try {
            // Convert the age from string to integer
            int age = Integer.parseInt(ageString);

            // Validate age
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Error: Age must be between 18 and 59.");
            }

            // Print valid name and age
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration successful.");

        } catch (NumberFormatException e) {
            // Handle case where age is not an integer
            System.out.println("Error: Age must be a valid integer.");
        } catch (InvalidAgeException e) {
            // Handle case where age is out of the valid range
            System.out.println(e.getMessage());
        } finally {
            System.exit(0); // Exit the program gracefully
        }
    }
}

