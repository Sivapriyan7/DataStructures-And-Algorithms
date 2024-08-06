package wipro.Packages.automobile;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Compartment
        compartment compartment = new compartment(10.5, 20.0, 15.0);

        // Display the details of the compartment
        System.out.println(compartment);

        // Modify the attributes of the compartment
        compartment.setHeight(12.0);
        compartment.setWidth(22.0);
        compartment.setBreadth(16.0);

        // Display the updated details of the compartment
        System.out.println(compartment);
    }
}
