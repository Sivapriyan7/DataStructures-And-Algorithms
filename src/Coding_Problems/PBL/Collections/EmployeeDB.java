package Coding_Problems.PBL.Collections;

import java.util.ArrayList;

public class EmployeeDB {
    private ArrayList<Employee> list;

    // Constructor
    public EmployeeDB() {
        list = new ArrayList<>();
    }

    // Method to add an employee
    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    // Method to delete an employee by empId
    public boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.getEmpId() == empId) {
                return list.remove(e);
            }
        }
        return false;
    }

    // Method to show payslip of an employee by empId
    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.getEmpId() == empId) {
                return "Pay Slip for Employee ID " + empId + ": \n" +
                        "Name: " + e.getEmpName() + "\n" +
                        "Salary: " + e.getSalary();
            }
        }
        return "Employee with ID " + empId + " not found.";
    }
}
