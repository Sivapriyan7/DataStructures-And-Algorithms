package Coding_Problems.PBL.Wrapper_Classes;

public class Employee implements Cloneable {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override the clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Print the details of the employee
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        try {
            // Create an original Employee object
            Employee originalEmployee = new Employee("John Doe", 12345, 50000.0);

            // Clone the original Employee object
            Employee clonedEmployee = (Employee) originalEmployee.clone();

            // Modify the original Employee's properties
            originalEmployee.setName("Jane Smith");
            originalEmployee.setId(67890);
            originalEmployee.setSalary(60000.0);

            // Print details of both original and cloned Employee objects
            System.out.println("Original Employee:");
            originalEmployee.printDetails();

            System.out.println("\nCloned Employee:");
            clonedEmployee.printDetails();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
