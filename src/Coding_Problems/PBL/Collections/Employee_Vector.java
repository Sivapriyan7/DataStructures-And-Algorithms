package Coding_Problems.PBL.Collections;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

class Employeew {
    String name;
    int age;

    public Employeew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
}

public class Employee_Vector {
    public static void main(String[] args) {
        Vector<Employeew> employees = new Vector<>();

        employees.add(new Employeew("John Doe", 30));
        employees.add(new Employeew("Jane Doe", 25));
        employees.add(new Employeew("Bob Smith", 40));

        System.out.println("Using Iterator:");
        Iterator<Employeew> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing Enumeration:");
        Enumeration<Employeew> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}