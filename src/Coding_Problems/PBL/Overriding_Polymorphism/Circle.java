package Coding_Problems.PBL.Overriding_Polymorphism;

public class Circle extends Shape {
    // Override the draw method to draw a circle
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    // Override the erase method to erase a circle
    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}
