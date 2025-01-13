import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        // Trying to get a substring with invalid start and end indices
        String substring = input.substring(5, 2); // This will throw IllegalArgumentException
        System.out.println("Substring: " + substring);
    }

    // Method to handle IllegalArgumentException and generic RuntimeException
    public static void handleException(String input) {
        try {
            generateException(input); // Calling the method that generates the exception
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
            System.out.println("Start index cannot be greater than the end index for substring!");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call method to generate the exception
        System.out.println("\nGenerating IllegalArgumentException:");
        handleException(input);
        
        scanner.close();
    }
}
