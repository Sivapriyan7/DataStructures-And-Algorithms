package Coding_Problems.PBL.Overriding_Polymorphism;

public class Shape {
    // Method to draw a shape
    public void draw() {
        System.out.println("Drawing Shape");
    }

    // Method to erase a shape
    public void erase() {
        System.out.println("Erasing Shape");
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Create objects of Circle, Triangle, and Square using Shape references
        Shape s1 = new Shape();
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        s1.draw();
        s1.erase();
        // Call draw and erase methods using each object
        c.draw();
        c.erase();

        t.draw();
        t.erase();

        s.draw();
        s.erase();
    }
}
