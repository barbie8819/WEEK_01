import java.util.*;
import java.lang.Math;
public class HarshadNumber{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the valid number : ");
        // Taking the input from user
        int number = sc.nextInt();
        int temporary = number;
        int sumOfDigits = 0;
        // Calculate the sum of digits using while loops
        while(number > 0){
            sumOfDigits += (number%10);

            number /= 10;
        }
        // Check if the number is divided by the sum of its digits
        if(temporary % sumOfDigits == 0)
            System.out.println("Yes its a Harshad Number");
        else
            System.out.println("No its not a Harshad Number ");
        
    }
}