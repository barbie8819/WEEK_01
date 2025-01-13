import java.util.Scanner;

public class RocketLaunch2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the countdown 
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println( i);
        }
        // Close the scanner
        scanner.close();
    }
}
