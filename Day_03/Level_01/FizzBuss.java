import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if number is positive
        if (number > 0) {
String[] array= new String[number+2];
            // Loop from 1 to the input number

for(int i=0;i<=number+1;i++){
  if (i % 3 == 0 && i % 5 == 0) {
                    array[i]="FizzBuss";
                } else if (i % 3 == 0) {
                  array[i]= ("Fizz");
                } else if (i % 5 == 0) {
                 array[i]=("Buzz");
                } else {
                   array[i]=Integer.toString(i);
                }
}
for(int i=0;i<=number+1;i++){
         System.out.print(array[i] + " ");

}
              
   }       
    }
}
