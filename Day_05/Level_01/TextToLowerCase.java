import java.util.Scanner;

public class TextToLowerCase {

    // Method to convert upper case letters to Lowercase using ASCII values
    public static String toLowerCaseUsingCharAt(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if character is lowercase
            if (ch >= 'A' && ch<=  'Z') {
                ch = (char) (ch + 32); // Convert to uppercase
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, strings are not equal
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character is different, strings are not equal
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to uppercase using String built-in method
        String builtInLowerCase = input.toLowerCase();

        // Convert to Lowercase using user-defined method
        String customLowerCase = toLowerCaseUsingCharAt(input);

        // Compare the two strings
        boolean isSame = compareStrings(builtInLowerCase, customLowerCase);

        // Display results
        System.out.println("\nOriginal String: " + input);
        System.out.println("Built-in toLowerCase(): " + builtInLowerCase);
        System.out.println("Custom toLowerCaseUsingCharAt(): " + customLowerCase);
        System.out.println("Comparison Result: " + (isSame ? "Strings are identical" : "Strings are not identical"));

        scanner.close();
    }
}
