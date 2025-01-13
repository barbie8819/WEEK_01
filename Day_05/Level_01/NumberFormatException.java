import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Parsing the string to an integer
        int number = Integer.parseInt(text); // Throws NumberFormatException if input is invalid
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException and generic RuntimeException
    public static void handleException(String text) {
        try {
            generateException(text); // Generate the exception
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        String text = scanner.nextLine();

        // Call method to handle the exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);

        scanner.close();
    }
}
