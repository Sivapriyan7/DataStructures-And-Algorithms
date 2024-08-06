package wipro.IOStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", new Date(), "Engineering", "Software Engineer", 75000.00);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            oos.writeObject(employee);
            System.out.println("Employee object has been serialized.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }
}

