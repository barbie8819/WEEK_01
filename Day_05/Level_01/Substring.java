import java.util.Scanner;

public class Substring {

    public static String SubstringCharAt(String s, int start, int end) {
        // Use StringBuilder for better performance
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read input string
        System.out.print("Enter the string: ");
        String s = input.nextLine();

        // Read start and end indices
        System.out.print("Enter the start index: ");
        int start = input.nextInt();
        System.out.print("Enter the end index: ");
        int end = input.nextInt();

        // Validate input indices
        if (start < 0 || end > s.length() || start > end) {
            System.out.println("Invalid range. Please ensure start >= 0, end <= string length, and start <= end.");
            return;
        }

        // Extract substring using both methods
        String subByCharAt = SubstringCharAt(s, start, end);
        String subByMethod = s.substring(start, end);

        // Print results
        System.out.println("Substring using custom method: " + subByCharAt);
        System.out.println("Substring using built-in method: " + subByMethod);

        // Compare results
        if (subByCharAt.equals(subByMethod)) {
            System.out.println("Yes both result are same ");
        } else {
            System.out.println("No both result are different ");
        }
    }
}
