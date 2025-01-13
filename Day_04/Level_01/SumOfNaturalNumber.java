import java.util.Scanner;

public class SumOfNaturalNumber {


 // Method to find the sum of n natural numbers using a loop

    public int findSum(int n) {
// Initialize sum to 0
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
        SumOfNaturalNumber obj = new SumOfNaturalNumber();
            // Calculate and print the sum
      
            int sum = obj.findSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }

   
}
