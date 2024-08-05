package Coding_Problems.PBL.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class StringListExample {

    // Create an ArrayList that stores only Strings
    private ArrayList<String> stringList;

    public StringListExample() {
        // Initialize the ArrayList
        stringList = new ArrayList<>();
    }

    // Method to add a String to the ArrayList
    public void addString(String str) {
        stringList.add(str);
    }

    // Method to print all elements of the ArrayList using an Iterator
    public void printAll() {
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        // Create an instance of StringListExample
        StringListExample example = new StringListExample();

        // Add some Strings to the ArrayList
        example.addString("Hello");
        example.addString("World");
        example.addString("Java");
        example.addString("ArrayList");

        // Print all elements
        example.printAll();
    }
}
