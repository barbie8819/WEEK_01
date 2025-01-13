import java.util.Scanner;

public class NumberOfChocolate{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number of chocolates
        System.out.print("Enter number of chocolates : ");
        int numberOfchocolates = input.nextInt();
 // Prompt user to enter number of Children
        System.out.print("Enter number of Children : ");
        int numberOfChildren = input.nextInt();
        // Print the result
       System.out.println("The number of chocolates  each child gets is " + (numberOfchocolates/numberOfChildren)+ " and the number of remaining Chocolates are "+ (numberOfchocolates%numberOfChildren) );
        // Close the input
        input.close();
    }
}
