import java.util.Scanner;

public class WeightConversion{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds : ");
        int weight = input.nextInt();

        // Print the result
       System.out.println("  The weight of the person in pound is  " + weight + " and in kg is " + (double)weight* 2.2 );
        // Close the input
        input.close();
    }
}
