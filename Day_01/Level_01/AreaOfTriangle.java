import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle : ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;

        

        double areaInches = (areaCm/2.54)/2.54;

        // Display the results
System.out.println("The area in Cm is " + areaCm + " and area in Inches is " + areaInches);
        // Close the Scanner
        input.close();
    }
}
