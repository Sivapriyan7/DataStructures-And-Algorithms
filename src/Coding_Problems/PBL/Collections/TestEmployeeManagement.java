package Coding_Problems.PBL.Collections;

public class TestEmployeeManagement {

    public static void main(String[] args) {
        // Create EmployeeDB instance
        EmployeeDB employeeDB = new EmployeeDB();

        // Create some Employee objects
        Employee emp1 = new Employee(1, "Alice Smith", "alice@example.com", "Female", 50000.0f);
        Employee emp2 = new Employee(2, "Bob Johnson", "bob@example.com", "Male", 60000.0f);
        Employee emp3 = new Employee(3, "Carol Williams", "carol@example.com", "Female", 55000.0f);

        // Add employees to the database
        employeeDB.addEmployee(emp1);
        employeeDB.addEmployee(emp2);
        employeeDB.addEmployee(emp3);

        // Display pay slips
        System.out.println(employeeDB.showPaySlip(1));
        System.out.println(employeeDB.showPaySlip(2));
        System.out.println(employeeDB.showPaySlip(4)); // Non-existing employee

        // Delete an employee
        employeeDB.deleteEmployee(2);

        // Display pay slips again to see the effect of deletion
        System.out.println(employeeDB.showPaySlip(2)); // After deletion
        System.out.println(employeeDB.showPaySlip(3)); // Still exists
    }
}
