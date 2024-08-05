package Coding_Problems.PBL.Overriding_Polymorphism;

public class Square extends Shape {
    // Override the draw method to draw a square
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    // Override the erase method to erase a square
    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

