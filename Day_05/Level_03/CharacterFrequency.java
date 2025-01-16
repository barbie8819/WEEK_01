import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static int[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character

        // Loop to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count distinct characters
        int distinctCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                distinctCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        int[][] charFrequency = new int[distinctCount][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                charFrequency[index][0] = i; // Store ASCII value of the character
                charFrequency[index][1] = frequency[i]; // Store frequency
                index++;
            }
        }

        return charFrequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method and store the result
        int[][] result = findCharacterFrequencies(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (int[] entry : result) {
            char character = (char) entry[0];
            int frequency = entry[1];
            System.out.println(character + ": " + frequency);
        }

        scanner.close();
    }
}
