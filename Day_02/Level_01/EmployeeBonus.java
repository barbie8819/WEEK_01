import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if years of service is more than 5
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // Calculate 5% bonus
            System.out.println("The bonus  is: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 years or less of service.");
        }

        scanner.close();
    }
}
