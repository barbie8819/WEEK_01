import java.util.Scanner;

public class StudentFee {
    public static void main(String[] args) {
        //  Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter  fee 
        System.out.print("Enter the total fee amount  ");
        int fee = input.nextInt();

        // Prompt the user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = ((double)fee * discountPercent) / 100;

        // Calculate the final fee after applying the discount
        double finalFee = fee - discount;

      System.out.println("The discount amount is INR " + discount +  " and final discounted fee is INR " + discountPercent);
        // Close the Scanner
        input.close();
    }
}
