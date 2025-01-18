import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int num1 = getInput(scanner, "First number: ");
        int num2 = getInput(scanner, "Second number: ");
        int num3 = getInput(scanner, "Third number: ");

        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }

    // Function to get input from the user
    private static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    private static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
