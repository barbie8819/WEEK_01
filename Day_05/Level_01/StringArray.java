import java.util.Scanner;
import java.util.Arrays;

public class StringArrayComparison {

    // User-defined method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
        }
        return result;
    }

    // User-defined method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read input string
        System.out.print("Enter the string: ");
        String s = input.next();

        // Call the user-defined method to get characters
        char[] resultFromMethod = getCharacters(s);

        // Call the built-in method to get characters
        char[] resultFromInbuilt = s.toCharArray();

        // Display both arrays (optional for debugging purposes)
        System.out.println("Result from user-defined method: " + Arrays.toString(resultFromMethod));
        System.out.println("Result from built-in method: " + Arrays.toString(resultFromInbuilt));

        // Compare the two arrays using the user-defined comparison method
        if (compareCharArrays(resultFromMethod, resultFromInbuilt)) {
            System.out.println("Yes, both arrays are equal.");
        } else {
            System.out.println("No, the arrays are not equal.");
        }
    }
}
