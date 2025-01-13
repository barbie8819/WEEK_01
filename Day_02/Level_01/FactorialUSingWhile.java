import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1; 
            int i = 1;        

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
