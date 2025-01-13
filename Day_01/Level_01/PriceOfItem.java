import java.util.Scanner;

public class PriceOfItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unitPrice : ");
        int unitPrice = input.nextInt();

      

        System.out.print("Enter the quantity : ");
        int quantity = input.nextInt();

       int totalPrice = unitPrice*quantity;

        // Display the results
System.out.println("The total purchase price is INR " +totalPrice + " if the quantity  " + quantity +" and unit price is INR "+ unitPrice);
        // Close the Scanner
        input.close();
    }
}
