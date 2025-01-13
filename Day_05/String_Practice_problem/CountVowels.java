import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string1 = input.nextLine(); 
        int vowels = 0, consonants = 0;

        string1 = string1.toLowerCase();
        for (int i = 0; i < string1.length(); i++) { 
        // Correct condition and method
            char ch = string1.charAt(i);  
        // Use charAt() to get a character
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
           // Check if it's a consonant
                consonants++;
            }
        }

        System.out.println("Number of vowels in \"" + string1 + "\" is: " + vowels);
        System.out.println("Number of consonants in \"" + string1 + "\" is: " + consonants);
    }
}
