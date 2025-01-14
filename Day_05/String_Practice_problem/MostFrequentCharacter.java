import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        if (str.isEmpty()) {
            System.out.println("The input string is empty!");
            return;
        }

        // Map to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Calculate frequencies
        for (char ch : str.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        // Find the most frequent character
        char mostFrequentChar = ' ';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Output the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
