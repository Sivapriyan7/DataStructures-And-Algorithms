package Coding_Problems.PBL.Classes_Objects;

class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor to initialize the dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume of the box
    public double getVolume() {
        return width * height * depth;
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Create an object of the Box class
        Box myBox = new Box(5.0, 10.0, 3.0);

        // Calculate and print the volume of the box
        double volume = myBox.getVolume();
        System.out.println("The volume of the box is: " + volume);
    }
}
