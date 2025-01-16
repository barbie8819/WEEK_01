import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // If the lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Convert both texts to lowercase and remove spaces
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // Create arrays to store the frequency of characters in both strings
        int[] frequency1 = new int[256];  // Assuming ASCII characters
        int[] frequency2 = new int[256];  // Assuming ASCII characters

        // Calculate frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequencies of the characters
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a scanner to read user inputs
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for the two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Call the method and display the result
        if (areAnagrams(text1, text2)) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }

        scanner.close();
    }
}
