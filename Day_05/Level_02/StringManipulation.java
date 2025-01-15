import java.util.Scanner;

public class StringManipulation {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indices of the trimmed string
        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Take user input for the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String inputString = scanner.nextLine();

        // Call the trimSpaces method to find the start and end indices after trimming spaces
        int[] trimIndices = trimSpaces(inputString);

        // Create the trimmed string using the indices
        String trimmedStringUsingCharAt = createSubstring(inputString, trimIndices[0], trimIndices[1]);

        // Use the built-in trim() method to trim spaces
        String trimmedStringUsingBuiltIn = inputString.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedStringUsingCharAt, trimmedStringUsingBuiltIn);

        // Display the results
        System.out.println("Trimmed string using charAt(): " + trimmedStringUsingCharAt);
        System.out.println("Trimmed string using built-in trim(): " + trimmedStringUsingBuiltIn);
        System.out.println("Are the two trimmed strings equal? " + areEqual);

        scanner.close();
    }
}
