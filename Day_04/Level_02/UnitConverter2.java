import java.util.Scanner;

public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user which conversion to perform
        System.out.println("Enter the number of yards to convert to feet:");
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.println("Enter the number of feet to convert to yards:");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.println("Enter the number of meters to convert to inches:");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.println("Enter the number of inches to convert to meters:");
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        System.out.println("Enter the number of inches to convert to centimeters:");
        double inchesForCm = scanner.nextDouble();
        System.out.println(inchesForCm + " inches = " + convertInchesToCentimeters(inchesForCm) + " centimeters");

        scanner.close();
    }
}