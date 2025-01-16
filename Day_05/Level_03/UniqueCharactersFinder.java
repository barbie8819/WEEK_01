import java.util.Scanner;

public class UniqueCharactersFinder {

    // Method to find the length of a string without using the built-in length() method
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to find characters that occur only once in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] tempUniqueChars = new char[length];
        int uniqueCount = 0;

        // Outer loop to iterate over each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character appears again in the string
            for (int j = 0; j < length; j++) {
                if (i != j && text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If truly unique, add to the array
            if (isUnique) {
                tempUniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Create a new array to store only the characters that occur once
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUniqueChars[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(input);

        // Display unique characters
        System.out.println("Characters that occur only once:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
    }
}
