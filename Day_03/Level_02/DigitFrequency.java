import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int[] frequency = new int[10];

        long temp = Math.abs(number); 
        while (temp > 0) {
            int digit = (int) (temp % 10); 
            frequency[digit]++;           
            temp /= 10;                  
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { 
                System.out.println(i + " frequency is : " + frequency[i]);
            }
        }

        scanner.close();
    }
}
