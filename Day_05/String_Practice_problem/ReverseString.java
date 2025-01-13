import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String s = input.next();

        // Display the original string
        System.out.println("Original string: " + s);

        // Reverse the string
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reverse.toString());
    }
}
