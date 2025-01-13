import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a year (greater than 1582): ");
        int year = scanner.nextInt();

       
        if (year <= 1582) {
            System.out.println("Please enter a year greater than 1582.");
        } else {
            
if(year % 4==0 && year%100!=0 ){
                System.out.println(year + " is a leap year.");
}
else if( year%4==0 && year%100==0 && year% 400==0){
                System.out.println(year + " is a leap year.");
          
        }

else
                System.out.println(year + " is not a leap year.");
}

        scanner.close();
    }
}
