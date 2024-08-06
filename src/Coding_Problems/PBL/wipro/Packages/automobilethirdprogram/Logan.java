package wipro.Packages.automobilethirdprogram;


public class Logan extends Vehicle {
    private int speed;

    // Constructor
    public Logan(int speed) {
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return "Logan Model";
    }

    @Override
    public String getRegistrationNumber() {
        return "LG9876";
    }

    @Override
    public String getOwnerName() {
        return "Logan Owner";
    }

    public int speed() {
        return speed;
    }

    public void gps() {
        System.out.println("Controlling the GPS device in Logan.");
    }
}

