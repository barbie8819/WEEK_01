import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Define a formatter for input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date input from the user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Convert the input string to a LocalDate object
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Perform the date arithmetic
        LocalDate newDate = date.plusDays(7)          // Add 7 days
                                .plusMonths(1)      // Add 1 month
                                .plusYears(2)       // Add 2 years
                                .minusWeeks(3);     // Subtract 3 weeks

        // Display the result
        System.out.println("Original date: " + date.format(formatter));
        System.out.println("New date after arithmetic: " + newDate.format(formatter));

        // Close the scanner
        scanner.close();
    }
}
