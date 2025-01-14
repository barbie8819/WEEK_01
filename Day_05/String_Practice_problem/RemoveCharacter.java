import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Read the character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0);

        // Remove all occurrences of the character
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                modifiedString.append(str.charAt(i));
            }
        }

        // Output the result
        System.out.println("Modified String: " + modifiedString.toString());
    }
}
