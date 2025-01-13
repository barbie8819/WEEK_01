import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
  // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number");
int number =  scanner.nextInt();
        // Create an array to store up to 10  values
        int[] table = new int[10];
      for(int i=0;i<table.length;i++)
      table[i]= number*(i+1);
     

        // Display the table
for(int i=1;i<=10;i++)
        System.out.println(number + "*" + i + " = " + table[i-1] );

        // Close the scanner
        scanner.close();
    }
}
