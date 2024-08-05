package Coding_Problems.PBL.Classes_Objects;

public class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 50000, 2015, "AB123456C");

        // Test getters
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());

        // Test setters
        employee.setName("Jane Doe");
        employee.setAnnualSalary(60000);
        employee.setYearStarted(2018);
        employee.setNationalInsuranceNumber("XY987654Z");

        // Print updated details
        System.out.println("\nUpdated Employee Details:");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
    }
}
