import java.util.Scanner;

class EmployeeSalary {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Declare the Array
      double[] salary = new double[10];
      int[] years = new int[10];

      System.out.println("Enter the salary of 10 employees: ");
      for (int i = 0; i < 10; i++) {

            salary[i] = input.nextDouble();
if(salary[i]<=0){
        System.out.println("Enter the valid salary: ");
i--;
}

         }
        System.out.println("Enter the year of service of 10 employees: ");
      for (int i = 0; i < 10; i++) {
            years[i] = input.nextInt();
if(years[i]<=0){
        System.out.println("Enter the valid year: ");
i--;
}
         }
double[] newSalary = new double[10];
double[] bonus = new double[10];
double totalBonus = 0;
   for (int i = 0; i < 10; i++) {
if(years[i]<=5){
       newSalary[i] = salary[i]*(1.05);
       bonus[i]= salary[i]*(0.05);
    totalBonus += bonus[i];
}
else{
 newSalary[i] = salary[i]*(1.02);
       bonus[i]= salary[i]*(0.02);
    totalBonus += bonus[i];

}

         }
for(int i=0;i<10;i++){

      System.out.println("The old salary of employee : " + salary[i] + " and the newSalary is : " + newSalary[i] );

}

      System.out.println("The total bonus company zara has to pay : " + totalBonus);


      // Close the Scanner Object
      input.close();
   }
}

