import java.util.Scanner;

public class SmallestNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the first number ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number ");
        int number3 =input.nextInt();

        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }

        // Close the input
        input.close();
    }
}
