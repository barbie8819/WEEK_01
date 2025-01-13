import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number from 6 to 9 : ");
        int number = scanner.nextInt();

        if (number > 9 || number <6) {
            System.out.println("The Number is invalid : ");
        } else {
for(int i=1;i<=10;i++){
   System.out.println(number+ "*" + i + "="+ (number*i));
}             
        }

        scanner.close();
    }
}
