package wipro.Packages.automobilethirdprogram;

public class Ford extends Vehicle {
    private int speed;

    // Constructor
    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return "Ford Model";
    }

    @Override
    public String getRegistrationNumber() {
        return "FD1234";
    }

    @Override
    public String getOwnerName() {
        return "Ford Owner";
    }

    public int speed() {
        return speed;
    }

    public void tempControl() {
        System.out.println("Controlling the air conditioning device in Ford.");
    }
}

