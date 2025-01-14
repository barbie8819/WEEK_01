import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the two strings
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        // Check if the strings are anagrams
        boolean isAnagram = areAnagrams(str1, str2);

        // Output the result
        if (isAnagram) {
            System.out.println("The two strings are anagrams of each other.");
        } else {
            System.out.println("The two strings are NOT anagrams of each other.");
        }
    }

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not the same, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare the sorted arrays
        return Arrays.equals(chars1, chars2);
    }
}
