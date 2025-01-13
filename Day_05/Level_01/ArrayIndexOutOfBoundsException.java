import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing an index larger than the array length
        System.out.println("Accessing element at index 5: " + names[5]); // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException and generic RuntimeException
    public static void handleException(String[] names) {
        try {
            generateException(names); // Calling the method that generates the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
            System.out.println("Invalid index! The index is out of bounds for the array.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for array of names
        System.out.print("Enter the number of names you want to add: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call the method to handle the exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);

        scanner.close();
    }
}
