import java.util.Scanner;

public class SideOfSq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the parameter: ");
        int parameter = input.nextInt();

       int side = parameter/4;
        

       

        // Display the results
System.out.println("The length of the side is " + side + " and parameter is " + parameter);
        // Close the Scanner
        input.close();
    }
}
