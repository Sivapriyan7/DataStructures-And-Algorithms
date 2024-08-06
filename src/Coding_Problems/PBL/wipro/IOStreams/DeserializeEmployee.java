package wipro.IOStreams;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
    public static void main(String[] args) {
        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
            Employee employee = (Employee) ois.readObject();
            System.out.println("Employee object has been deserialized:");
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}

