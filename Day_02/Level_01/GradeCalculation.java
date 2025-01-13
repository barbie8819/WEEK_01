import java.util.Scanner;

public class GradeCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Chemistry marks ");
        double chemistry = scanner.nextDouble();
  System.out.print("Enter a physics marks ");
        double physics = scanner.nextDouble();
  System.out.print("Enter a maths marks ");
         double maths = scanner.nextDouble();
       double marks=((maths + physics + chemistry)/300)*100;
        if (marks >= 80) 
            System.out.println("marks : " +marks + " Grade A ");
      else  if (marks >= 70 && marks <=79) 
            System.out.println("marks : " +marks + " Grade B ");
      else  if (marks >= 60 && marks <=69) 
            System.out.println("marks : " +marks + " Grade C ");
      else  if (marks >= 50 && marks <=59) 
            System.out.println("marks : " +marks + " Grade D ");
      else  if (marks >= 40 && marks <=49) 
            System.out.println("marks : " +marks + " Grade E ");
      else 
            System.out.println("marks : " +marks + " Grade R ");
        scanner.close();
    }
}
