import java.util.Scanner;

public class HandShake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student : ");
        int student = input.nextInt();

      

        int handShake = (student *(student-1))/2;


        // Display the results
System.out.println("The total possible handshakes " + handShake );
        // Close the Scanner
        input.close();
    }
}
