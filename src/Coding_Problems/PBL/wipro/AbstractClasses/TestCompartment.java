package Coding_Problems.PBL.wipro.AbstractClasses;

import java.util.Random;

public class TestCompartment {

    public static void main(String[] args) {
        // Declare an array of Compartment of size 10
        Compartment[] compartments = new Compartment[10];

        // Fill the compartments array with randomly selected compartment types
        Random random = new Random();
        for (int i = 0; i < compartments.length; i++) {
            int randomNum = random.nextInt(4) + 1; // Generates random number in range 1 to 4

            switch (randomNum) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
                default:
                    break;
            }
        }

        // Demonstrate polymorphic behavior by calling the notice method
        for (Compartment compartment : compartments) {
            compartment.notice();
        }
    }
}

