import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter principle
        System.out.print("Enter principle : ");
        int Principle = input.nextInt();
// Prompt user to enter Rate
        System.out.print("Enter Rate : ");
        int Rate = input.nextInt();
// Prompt user to enter Time
        System.out.print("Enter Time : ");
        int Time = input.nextInt();
double simpleInterest=(double)Principle * (double)Rate * (double)Time / 100;
        // Print the result
       System.out.println(" The Simple Interest is " +simpleInterest+ " for Principal "+ Principle + ",Rate of Interest"+ Rate+ " and Time " +Time );
        // Close the input
        input.close();
    }
}
