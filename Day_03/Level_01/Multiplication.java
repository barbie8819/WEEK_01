import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication table results
        int[] table = new int[10];

        // Populate the array with multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i; // Store the result at index (i - 1)
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        // Close the scanner
        scanner.close();
    }
}
