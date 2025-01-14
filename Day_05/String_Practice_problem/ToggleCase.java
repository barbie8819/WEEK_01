import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String str = input.nextLine();
  
        // Toggle case of each character
        StringBuilder toggledString = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                // For non-alphabetic characters, append as is
                toggledString.append(ch);
            }
        }

        // Output the toggled string
        System.out.println("Toggled case string: " + toggledString);
    }
}
