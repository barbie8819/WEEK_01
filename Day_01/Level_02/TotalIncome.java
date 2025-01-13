import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter salary
        System.out.print("Enter your salary : ");
        double salary = input.nextDouble();

        // Prompt user to enter bonus
        System.out.print("Enter your bonus : ");
        double bonus = input.nextDouble();

        // Calculate  income
        double income = salary + bonus;

        // Print the result
       System.out.println("The salary is INR " + salary + " and bonus is INR "+ bonus + ".Hence Total Income is INR "+ income);
        // Close the input
        input.close();
    }
}
