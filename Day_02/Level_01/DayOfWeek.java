import java.util.*;
import java.lang.Math;
public class DayOfWeek{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year");
        // Take the date as input
        int year = scanner .nextInt();
        System.out.println("Enter the month");
        int month = scanner .nextInt();
        System.out.println("Enter the day");
        int date = scanner .nextInt();

        int yhat = year - (14 - month)/ 12;
        int x = yhat + (yhat/14)- (yhat/100) + (yhat/400);
        int mhat = month + 12 * ((14-month) / 12) - 2;
        int datehat = (date + x + (31 * mhat)/12) %7;
        switch(datehat){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter the valid date");
                break;
        }

    }
}