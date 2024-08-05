package Coding_Problems.PBL.Classes_Objects;
class Animal {
    // Method to simulate eating behavior
    public void eat() {
        System.out.println("Animal is eating");
    }

    // Method to simulate sleeping behavior
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Create an instance of Animal class
        Animal animal = new Animal();
        // Invoke eat and sleep methods using the Animal object
        animal.eat();
        animal.sleep();

        // Create an instance of Bird class
        Bird bird = new Bird();
        // Invoke eat, sleep, and fly methods using the Bird object
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}

class Bird extends Animal {
    // Override the eat method to simulate eating behavior specific to Bird
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    // Override the sleep method to simulate sleeping behavior specific to Bird
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    // Method to simulate flying behavior
    public void fly() {
        System.out.println("Bird is flying");
    }
}
