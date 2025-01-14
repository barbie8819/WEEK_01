import java.util.Scanner;

public class LexicographicComparison {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the two strings
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = input.nextLine();

        // Compare the strings lexicographically
        int minLength = Math.min(str1.length(), str2.length());
        int result = 0; // 0 means equal, negative means str1 < str2, positive means str1 > str2

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        // If the strings are identical up to the shorter length, compare their lengths
        if (result == 0) {
            result = str1.length() - str2.length();
        }

        // Output the result

        if (result < 0) {
            System.out.println(str1 + " comes before "+ str2+ " lexicographically.");
        } else if (result > 0) {
            System.out.println(str1 + " comes after  "+ str2+ "  lexicographically.");
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }
    }
}
