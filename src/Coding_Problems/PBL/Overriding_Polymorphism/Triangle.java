package Coding_Problems.PBL.Overriding_Polymorphism;

public class Triangle extends Shape {
    // Override the draw method to draw a triangle
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    // Override the erase method to erase a triangle
    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}
