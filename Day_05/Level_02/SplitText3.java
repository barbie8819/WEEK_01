import java.util.Scanner;

public class SplitText3 {

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

    // Method to generate a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }

        return wordLengths;
    }

    // Method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = Integer.parseInt(wordLengths[0][1]);

        for (String[] entry : wordLengths) {
            int length = Integer.parseInt(entry[1]);
            if (length < shortestLength) {
                shortest = entry[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = entry[0];
                longestLength = length;
            }
        }

        return new String[] { shortest, String.valueOf(shortestLength), longest, String.valueOf(longestLength) };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Split text using custom method
        String[] customSplit = splitText(input);

        // Generate 2D array with words and their lengths
        String[][] wordLengths = wordsWithLengths(customSplit);

        // Find shortest and longest strings
        String[] shortestAndLongest = findShortestAndLongest(wordLengths);

        // Display results in tabular format
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] entry : wordLengths) {
            System.out.println(entry[0] + "\t" + Integer.parseInt(entry[1]));
        }

        // Display shortest and longest strings
        System.out.println("\nShortest word: " + shortestAndLongest[0] + " (Length: " + shortestAndLongest[1] + ")");
        System.out.println("Longest word: " + shortestAndLongest[2] + " (Length: " + shortestAndLongest[3] + ")");
    }
}
