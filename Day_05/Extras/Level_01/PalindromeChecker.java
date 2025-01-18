import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        displayResult(input, isPalindrome);

        scanner.close();
    }

    // Function to check if a string is a palindrome
    private static boolean checkPalindrome(String input) {
        String sanitized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = sanitized.length();

        for (int i = 0; i < length / 2; i++) {
            if (sanitized.charAt(i) != sanitized.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Function to display the result
    private static void displayResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}
