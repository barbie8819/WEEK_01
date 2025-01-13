import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number1 : ");
        int number1 = input.nextInt();

        System.out.print("Enter the number2 : ");
        int number2 = input.nextInt();

       
        // Display the results
System.out.println("The Quotient is " + (number1/number2) + " and Reminder is "+ (number1%number2) + " of two number" + number1 + " and " +number2 );
        // Close the Scanner
        input.close();
    }
}