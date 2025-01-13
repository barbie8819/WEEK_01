import java.util.Scanner;

public class Athelete {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter sides
        System.out.print("Enter side1 of park in meter : ");
        int side1 = input.nextInt();
System.out.print("Enter side2 of park in meter : ");
        int side2 = input.nextInt();
System.out.print("Enter side3 of park in meter : ");
        int side3 = input.nextInt();
int rounds =( 5*1000) /(side1+ side2 + side3);
   
        // Print the result
       System.out.println("total number of rounds the athelete will run is " + rounds );
        // Close the input
        input.close();
    }
}
