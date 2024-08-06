package wipro.Packages.automobilesecondprogram;

public class Honda extends Vehicle {
    private int speed;

    // Constructor
    public Honda(int speed) {
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return "Honda Model";
    }

    @Override
    public String getRegistrationNumber() {
        return "HN5678";
    }

    @Override
    public String getOwnerName() {
        return "Honda Owner";
    }

    public int getSpeed() {
        return speed;
    }

    public void cdPlayer() {
        System.out.println("Controlling the CD player device in Honda.");
    }
}

