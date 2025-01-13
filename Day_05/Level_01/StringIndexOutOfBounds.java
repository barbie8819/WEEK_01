import java.util.Scanner;

public class StringIndexOutOfBounds {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
        // Trying to access an index beyond the length of the string
        char character = input.charAt(input.length()); // This will throw StringIndexOutOfBoundsException
        System.out.println("Character at index: " + character);
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch block
    public static void handleException(String input) {
        try {
            generateException(input); // Calling the method that generates the exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("String index out of bounds! The index is beyond the string length.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call method to generate the exception
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        handleException(input);
        
        scanner.close();
    }
}
