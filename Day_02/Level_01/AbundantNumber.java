import java.util.*;
import java.lang.Math;
public class AbundantNumber{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take the input from user
        int number = input .nextInt();
        int temp = number ;
        int sumOfDivisors = 0;
        // Calculate the sum of all the divisior
        for(int i = 1;i<= number  /2 ;i++){
            if(number%i == 0){
                sumOfDivisors += i;
            }
        }
        if(number <  sumOfDivisors)
            System.out.println("Yes Its a Abundant Number");
        else
            System.out.println("No Its not a Abundant Number");
        }
}