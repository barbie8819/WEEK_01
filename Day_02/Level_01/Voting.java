import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the age 
        System.out.print("Enter the age of the person: ");
        int age = scanner.nextInt();

        // Check age
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner
        scanner.close();
    }
}
