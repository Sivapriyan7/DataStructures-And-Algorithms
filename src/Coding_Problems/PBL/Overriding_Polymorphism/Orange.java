package Coding_Problems.PBL.Overriding_Polymorphism;

public class Orange extends Fruit {
    // Constructor to initialize the attributes
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Override the eat method to describe the orange's name and taste
    @Override
    public void eat() {
        System.out.println("The fruit is " + name + " and it tastes " + taste + " (juicy and tangy).");
    }
}
