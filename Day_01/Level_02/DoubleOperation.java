import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user for input values
        System.out.println("Enter value for a: ");
        double a = input.nextDouble();

        System.out.println("Enter value for b: ");
        double b = input.nextDouble();

        System.out.println("Enter value for c: ");
       double c = input.nextDouble();

        // Perform calculations
       double result1 = a + b * c; 
       double result2 = a * b + c; 
       double result3 = c + a / b;
       double result4 = a % b + c; 

        // Print the results
        System.out.println("Result of intOperations are " + result1 +","+result2+","+result3);
     
        // Close the scanner
       input.close();
    }
}
