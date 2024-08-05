package Coding_Problems.PBL.Overriding_Polymorphism;

public class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    // Constructor to initialize the attributes
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe the fruit's name and taste
    public void eat() {
        System.out.println("The fruit is " + name + " and its taste is " + taste + ".");
    }
}
