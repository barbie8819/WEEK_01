import java.util.Scanner;

public class SubstringOccurences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the main string
        System.out.print("Enter the main string: ");
        String mainString = input.nextLine();

        // Read the substring to count
        System.out.print("Enter the substring to count: ");
        String subString = input.nextLine();

        // Validate inputs
        if (mainString.isEmpty() || subString.isEmpty()) {
            System.out.println("Both the main string and substring must be non-empty!");
            return;
        }

        int count = 0;
        int index = 0;

        // Search for substring occurrences
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
 // Move past the current occurrence
        }

        System.out.println("The substring \"" + subString + "\" occurs " + count + " time(s) in the main string.");
    }
}
