import java.util.Scanner;

public class Longest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        if (string == null || string.isEmpty()) {
            System.out.println("Input is empty or null!");
            return;
        }

        int longest = 0, word = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                longest = Math.max(longest, word);
                word = 0; // Reset word length counter for the next word
            } else {
                word++; // Increment word length counter
            }
        }

        // Check the last word in the string
        longest = Math.max(longest, word);

        System.out.println("The length of the longest word is: " + longest);
    }
}
