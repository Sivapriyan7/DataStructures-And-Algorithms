package wipro.FlowcontrolStatements;

import java.util.Scanner;

public class colorname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color code (R, B, G, O, Y, W):");
        String colorCode = scanner.next().toUpperCase();
        scanner.close();

        String colorName = getColorName(colorCode);
        System.out.println(colorName);
    }

    public static String getColorName(String colorCode) {
        switch (colorCode) {
            case "R":
                return "Red";
            case "B":
                return "Blue";
            case "G":
                return "Green";
            case "O":
                return "Orange";
            case "Y":
                return "Yellow";
            case "W":
                return "White";
            default:
                return "Invalid Code";
        }
    }
}


