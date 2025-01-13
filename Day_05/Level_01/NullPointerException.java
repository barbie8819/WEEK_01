public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null; // Initializing text to null

        // This line will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to demonstrate handling of NullPointerException
    public static void handleNullPointerException() {
        String text = null; // Initializing text to null

        try {
            // Attempting to access a method on the null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.toString());
        }
    }

    public static void main(String[] args) {
        // Step 1: Call the method to generate the exception
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught Exception in main: " + e.toString());
        }

        System.out.println("\nHandling NullPointerException:");

        // Step 2: Call the method with exception handling
        handleNullPointerException();
    }
}
