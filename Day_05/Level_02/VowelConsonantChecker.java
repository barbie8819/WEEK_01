import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if it's an uppercase letter
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        // If not a letter, return Not a Letter
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] findVowelsAndConsonants(String str) {
        // Initialize a 2D array with two columns: character and its type
        String[][] result = new String[str.length()][2];
        
        // Loop through the string and populate the 2D array with characters and their types
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);  // Character at index i
            result[i][1] = checkCharacterType(ch);  // Type of the character (Vowel/Consonant/Not a Letter)
        }
        
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] array) {
        // Display the header
        System.out.printf("%-15s%-15s\n", "Character", "Type");
        
        // Display the data in tabular format
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-15s%-15s\n", array[i][0], array[i][1]);
        }
    }

    public static void main(String[] args) {
        // Take user input for the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Call the method to find vowels and consonants and store the result in a 2D array
        String[][] result = findVowelsAndConsonants(inputString);

        // Display the result in a tabular format
        displayTable(result);

        scanner.close();
    }
}
