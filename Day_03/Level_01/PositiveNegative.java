import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        // Define an array to store the 5 numbers
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Take user input for the ages
        System.out.println("Enter the 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(  numbers[i] + " is Negative");
            }
 else if (numbers[i] ==0) {
                System.out.println( numbers[i] +" The Number is Zero");
            }
 else {
  if (numbers[i] %2== 0) {
                System.out.println(numbers[i] +"  Number is Positive and Even");
            }
else
{
                System.out.println(numbers[i] + "  Number is Positive and Odd");

}
        }

}
if(numbers[0]==numbers[4])
                System.out.println(" equal ");
else if(numbers[0]>numbers[4]){
                System.out.println(" greater");
}
else{
                System.out.println(" smaller");
}
        scanner.close();
    
}
}