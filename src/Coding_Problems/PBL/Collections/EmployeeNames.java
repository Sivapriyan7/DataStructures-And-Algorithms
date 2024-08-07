package Coding_Problems.PBL.Collections;


import java.util.HashSet;
import java.util.Iterator;

public class EmployeeNames {
    public static void main(String[] args) {
        // Create a HashSet to store employee names
        HashSet<String> employeeNames = new HashSet<>();

        // Add employee names to the HashSet
        employeeNames.add("John Doe");
        employeeNames.add("Jane Doe");
        employeeNames.add("Bob Smith");
        employeeNames.add("Alice Johnson");

        // Create an Iterator to retrieve elements from the HashSet
        Iterator<String> iterator = employeeNames.iterator();

        // Retrieve and print elements one by one
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

