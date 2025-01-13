import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total variable 
        double total = 0.0;

        // Variable to store the user input
        double number;

        // Loop 
        while (true) {
            System.out.print("Enter a number (enter 0 to stop): ");
            number = scanner.nextDouble();

            // If the user enters 0, exit the loop
            if (number == 0) {
                break;
            }

            // Add the number to the total
            total += number;
        }

        // Display the sum
        System.out.println("The total sum is: " + total);

        // Close the scanner
        scanner.close();
    }
}
