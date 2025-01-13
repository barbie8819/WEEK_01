import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number1
        System.out.print("Enter number1 : ");
        int number1 = input.nextInt();

       // Prompt user to enter number2
        System.out.print("Enter number2 : ");
        int number2 = input.nextInt();

        // swap numbers
number1 = number1 + number2;
number2 = number1 - number2;
number1 = number1 - number2;

        // Print the result
       System.out.println("The swapped numbers are " + number1 + " and "+ number2 );
        // Close the input
        input.close();
    }
}
