import java.util.Scanner;

public class fahToCelcius {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the temperature in fahrenheit
        System.out.print("Enter the temperature in  fahrenheit ");
        double fahrenheit = input.nextDouble();

        // Convert  Fahrenheit to Celsius 
        double celcius = ((fahrenheit -32)*  (5 / 9));

      System.out.println("The "+ fahrenheit +" fahrenheit is "+ celcius +" celcius");
        // Close the scanner
      input.close();
    }
}

