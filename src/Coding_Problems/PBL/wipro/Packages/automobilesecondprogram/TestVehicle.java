package Coding_Problems.PBL.wipro.Packages.automobilesecondprogram;

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
    }
}

