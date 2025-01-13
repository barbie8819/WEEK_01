import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user for input values
        System.out.println("Enter value for a: ");
        int a = input.nextInt();

        System.out.println("Enter value for b: ");
        int b = input.nextInt();

        System.out.println("Enter value for c: ");
        int c = input.nextInt();

        // Perform calculations
        int result1 = a + b * c; 
        int result2 = a * b + c; 
        int result3 = c + a / b;
        int result4 = a % b + c; 

        // Print the results
        System.out.println("Result of intOperations are " + result1 +","+result2+","+result3);
     
        // Close the scanner
       input.close();
    }
}
