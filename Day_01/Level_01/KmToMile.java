import java.util.Scanner;

public class KmToMile {
    public static void main(String[] args) {
        // Create a Scanner object for  input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter distance in kilometers

        System.out.print("Enter distance in kilometers ");
        int km = input.nextInt();

        //  1 mile = 1.6 kilometers
        double miles = (double)km / 1.6;

        // show the result
System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        // Close the Scanner
        input.close();
    }
}