import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter the first string: ");
        String string1 = input.next();
        System.out.print("Enter the second string: ");
        String string2 = input.next();

        // Compare the strings using the charAt() method
        boolean charAtComparisonResult = compareUsingCharAt(string1, string2);

        // Compare the strings using the built-in equals() method
        boolean equalsMethodResult = string1.equals(string2);

        // Display the results
        System.out.println("\nComparison using charAt(): " + charAtComparisonResult);
        System.out.println("Comparison using equals(): " + equalsMethodResult);

        // Verify if both methods give the same result
        if (charAtComparisonResult == equalsMethodResult) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results of the two methods do not match.");
        }
    }

    /**
     * Method to compare two strings using the charAt() method
     */
    public static boolean compareUsingCharAt(String s1, String s2) {
        // Check if the lengths of the strings are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare characters one by one
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        // Return true if all characters match
        return true;
    }
}
