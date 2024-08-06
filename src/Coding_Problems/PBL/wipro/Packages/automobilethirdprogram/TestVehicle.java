package wipro.Packages.automobilethirdprogram;


public class TestVehicle {
    public static void main(String[] args) {
        // Create instances of Hero and Honda
        Hero hero = new Hero(80);
        Honda honda = new Honda(120);

        // Test Hero class
        System.out.println("Hero Details:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed() + " km/h");
        hero.radio();

        System.out.println();

        // Test Honda class
        System.out.println("Honda Details:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed() + " km/h");
        honda.cdPlayer();

        System.out.println();

        // Create instances of Logan and Ford
        Logan logan = new Logan(90);
        Ford ford = new Ford(150);

        // Test Logan class
        System.out.println("Logan Details:");
        System.out.println("Model: " + logan.getModelName());
        System.out.println("Registration Number: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.speed() + " km/h");
        logan.gps();

        System.out.println();

        // Test Ford class
        System.out.println("Ford Details:");
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Registration Number: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.speed() + " km/h");
        ford.tempControl();
    }
}

