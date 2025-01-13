import java.util.Scanner;

public class SumUsingFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Compute sum using the formula
            int sumFormula = n * (n + 1) / 2;

            // Compute sum using a while loop
            int sumLoop = 0;
            int i = 1;
            for(;i<=n;i++) {
                sumLoop += i;
               
            }

            // Display results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumLoop);

            // Compare results
            if (sumFormula == sumLoop) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a discrepancy in the results.");
            }
        }

        scanner.close();
    }
}
