import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number);
            displayResult(number, factorial);
        }

        scanner.close();
    }

    // Recursive function to calculate factorial
    private static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    // Function to display the result
    private static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
