import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if the character is a vowel or consonant
    public static String checkVowelOrConsonant(char ch) {
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

    // Method to count vowels and consonants in the string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through the string and count vowels and consonants
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkVowelOrConsonant(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return counts in an array: index 0 is vowels, index 1 is consonants
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        // Take user input for the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Call the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(inputString);

        // Display the result
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
    }
}
