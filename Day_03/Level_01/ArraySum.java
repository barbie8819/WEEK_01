import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Create an array to store up to 10 double values
        double[] numbers = new double[10];
        double total = 0.0; // Variable to store the sum of all numbers
        int index = 0;     // Index for the array

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Break the loop if the input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Break the loop if the array is full
            if (index == 10) {
                System.out.println("Array is full. Stopping input.");
                break;
            }

            // Store the input in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the total sum of the numbers in the array
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the total sum
        System.out.println("\nTotal sum of the numbers: " + total);

        // Close the scanner
        scanner.close();
    }
}
