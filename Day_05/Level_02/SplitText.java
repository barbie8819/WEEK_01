import java.util.Scanner;

public class SplitText {

    // Method to find the length of a string without using the built-in length() method
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split text into words without using the built-in split() method
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 0;

        // Count words by counting spaces and assuming at least one word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // Account for the last word

        // Array to store words
        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int wordEnd = (i == length - 1) ? i + 1 : i;
                words[wordIndex++] = text.substring(wordStart, wordEnd);
                wordStart = i + 1;
            }
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Split text using custom method
        String[] customSplit = splitText(input);

        // Split text using built-in split() method
        String[] builtInSplit = input.split(" ");

        // Compare the two results
        boolean areEqual = compareArrays(customSplit, builtInSplit);

        // Display results
        System.out.println("Custom split result:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split() result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nComparison result: " + areEqual);
    }
}
