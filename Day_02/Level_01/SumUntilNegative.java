import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum. Enter 0 or a negative number to stop:");

        while (true) {
// Take user input
            int number = scanner.nextInt(); 
// Exit the loop if 0 or a negative number is entered
            if (number <= 0) {
                break; 
            }

            sum += number;
	 // Add the number to the sum
        }

        System.out.println("The sum of the entered numbers is: " + sum);
        scanner.close();
    }
}
