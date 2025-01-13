import java.util.Scanner;

public class CentimeterToInches {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

       

        // Convert height in inches
        double totalInches = heightInCm / 2.54;

        // Calculate height in feet 
        double totalFeet =  (totalInches / 12);

        // Display the results
System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + totalFeet + " and inches is " + totalInches); 
        // Close the Scanner
        input.close();
    }
}
