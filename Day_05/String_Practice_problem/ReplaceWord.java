import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Read the word to replace and the replacement word
        System.out.print("Enter the word to replace: ");
        String targetWord = input.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = input.nextLine();

        // Replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, targetWord, replacementWord);

        // Output the result
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String targetWord, String replacementWord) {
        // Use regular expression to replace the exact word
        return sentence.replaceAll("\\b" + targetWord + "\\b", replacementWord);
    }
}
