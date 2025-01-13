import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        float number1 = input.nextFloat();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        float number2 = input.nextFloat();

        // Perform arithmetic operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
       float multiplication = number1 * number2;
        float division = number1 / number2 ;

        // Display the resul
      System.out.println("The addition,subtraction,multiplication and division value of 2 numbers " + number1 + " and "+ number2 + " is " + addition + "," + subtraction + "," + multiplication + "," +  division);
        // Close the Scanner
        input.close();
    }
}
