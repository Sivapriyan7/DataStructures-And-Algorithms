package wipro.Packages.automobilethirdprogram;

import wipro.Packages.automobilesecondprogram.Vehicle;

public class Hero extends Vehicle {
    private int speed;

    // Constructor
    public Hero(int speed) {
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return "Hero Model";
    }

    @Override
    public String getRegistrationNumber() {
        return "HR1234";
    }

    @Override
    public String getOwnerName() {
        return "Hero Owner";
    }

    public int getSpeed() {
        return speed;
    }

    public void radio() {
        System.out.println("Controlling the radio device in Hero.");
    }
}

