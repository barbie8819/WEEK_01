import java.util.*;
import java.lang.Math;
public class DigitCount{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        // Take the input from user
        int num = sc.nextInt();
        int temp = num;
        int NumberOfDigits = 0;
        // Count the digits using while loops
        while(num > 0){
            NumberOfDigits += 1;

            num /= 10;
        }
       System.out.println("Total number of digits in "+temp +" is "+NumberOfDigits);
        
    }
}