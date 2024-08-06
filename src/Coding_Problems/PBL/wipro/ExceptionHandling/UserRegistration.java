package wipro.ExceptionHandling;

public class UserRegistration {
    // Method to register the user
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        try {
            // Example 1: Invalid country
            registration.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println("InvalidCountryException: " + e.getMessage());
        }

        try {
            // Example 2: Valid country
            registration.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println("InvalidCountryException: " + e.getMessage());
        }
    }
}

