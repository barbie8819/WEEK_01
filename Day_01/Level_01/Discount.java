// importing Scanner class to take the inputs
import java.util.Scanner;
public class Discount{
public static void main(String[] args){
//Declaring variables
int fee = 125000 ;
//calculating the discount
int discountPercent = 10;
int discount = (fee*10)/100;
//Shows the output to the user
System.out.println("The discount amount is INR " + discount +
 " and final discounted fee is INR "+
 (fee-discount));
}
}