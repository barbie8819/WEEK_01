import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Distance in feet: ");
        int feet = input.nextInt();

       double yards = feet/3;
        double miles = yards/1760;

       

        // Display the results
System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
        // Close the Scanner
        input.close();
    }
}
