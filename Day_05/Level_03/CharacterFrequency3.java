import java.util.Scanner;

public class CharacterFrequency3 {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequencies = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') {
                continue;
            }
            frequencies[i] = 1;
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequencies[i]++;
                    characters[j] = '0'; // Mark duplicate as processed
                }
            }
        }

        // Calculate the result array size (excluding duplicates marked as '0')
        int resultSize = 0;
        for (char c : characters) {
            if (c != '0') {
                resultSize++;
            }
        }

        // Create the result array
        String[] result = new String[resultSize];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " - " + frequencies[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find and display character frequencies
        String[] frequencies = findCharacterFrequency(text);
        System.out.println("Character Frequencies:");
        for (String frequency : frequencies) {
            System.out.println(frequency);
        }

        scanner.close();
    }
}
