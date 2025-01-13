import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // tells the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.next();

        // Display the original string
        System.out.println("Original string: " + s);

        // Reverse the string
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }
if(s.equals(reverse)){
        // Display the result
        System.out.println("The string "+ s + " is palindrome");
}
else 
        System.out.println("The string "+ s + " is not palindrome");

    }
}
