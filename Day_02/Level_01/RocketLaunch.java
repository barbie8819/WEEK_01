import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the countdown start 
        System.out.print("Enter the  start value: ");
        int counter = scanner.nextInt();

       
        while (counter >= 1) {
            System.out.println(counter);
 // Decrement the counter
            counter--;
        }

  
        
        // Close the scanner
        scanner.close();
    }
}
