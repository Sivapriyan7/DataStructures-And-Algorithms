package Coding_Problems.PBL.Collections;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetOperations {
    public static void main(String[] args) {
        // Create a TreeSet to store String objects
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");

        treeSet.add("Date");
        treeSet.add("Cherry");

        treeSet.add("Elderberry");

        // a) Reverse the elements of the Collection
        System.out.println("Original TreeSet: " + treeSet);
        System.out.println("Reversed TreeSet: " + reverseTreeSet(treeSet));

        // b) Iterate the elements of the TreeSet using Iterator
        System.out.println("Iterating TreeSet using Iterator:");
        iterateTreeSet(treeSet);

        // c) Check if a particular element exists or not
        System.out.println("Checking if 'Cherry' exists: " + treeSet.contains("Cherry"));
        System.out.println("Checking if 'Fig' exists: " + treeSet.contains("Fig"));
    }

    // Method to reverse the elements of the TreeSet
    public static TreeSet<String> reverseTreeSet(TreeSet<String> treeSet) {
        TreeSet<String> reversedTreeSet = new TreeSet<>();
        Iterator<String> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            reversedTreeSet.add(iterator.next());
        }
        return reversedTreeSet;
    }

    // Method to iterate the elements of the TreeSet using Iterator
    public static void iterateTreeSet(TreeSet<String> treeSet) {
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

