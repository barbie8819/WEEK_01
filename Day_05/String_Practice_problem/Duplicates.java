import java.util.Scanner;
import java.util.LinkedHashSet;

public class Duplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        if (string == null || string.isEmpty()) {
            System.out.println("Input is empty or null!");
            return;
        }

        LinkedHashSet<Character> modified = new LinkedHashSet<>();
        for (char ch : string.toCharArray()) {
            modified.add(ch);
        }

        StringBuilder string2 = new StringBuilder();
        for (char item : modified) {
            string2.append(item);
        }

        System.out.println("Modified String is: " + string2.toString());
    }
}
