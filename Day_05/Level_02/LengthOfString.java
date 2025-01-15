// Importing Scanner Class to take input
import java.util.Scanner;

public class LengthOfString {
    // Method to find the length of the string
    public static int LengthByMethod(String s) {
        int count = 0, i = 0;
        while (true) {
            try {
                s.charAt(i); // Access each character
                i++;
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                // Handling exception to break the loop
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");

        String s = input.nextLine();
        int length = LengthByMethod(s);

        int lengthInBuilt = s.length();
        System.out.println("The length of string by Method \"" + s + "\" is " + length);
        System.out.println("The length of string by Inbuilt \"" + s + "\" is " + lengthInBuilt);
        
        if (lengthInBuilt == length) {
            System.out.println("Results from both methods are the same.");
        } else {
            System.out.println("Results from both methods are different.");
        }

        input.close(); // Closing the scanner
    }
}
