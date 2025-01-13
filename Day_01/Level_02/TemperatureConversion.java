import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

      System.out.println("The "+ celsius +" is "+ fahrenheit +" fahrenheit");
        // Close the scanner
      input.close();
    }
}
