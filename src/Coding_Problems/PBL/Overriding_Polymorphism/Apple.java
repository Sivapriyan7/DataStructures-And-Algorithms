package Coding_Problems.PBL.Overriding_Polymorphism;

public class Apple extends Fruit {
    // Constructor to initialize the attributes
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Override the eat method to describe the apple's name and taste
    @Override
    public void eat() {
        System.out.println("The fruit is " + name + " and it tastes " + taste + " (crisp and sweet).");
    }
}
