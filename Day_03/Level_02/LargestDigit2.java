import java.util.Arrays;

import java.util.Scanner;

public class LargestDigit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   System.out.print("\nEnter the valid number : ");
        long  number = scanner.nextLong();
        int maxDigit= 10;
        long dummy = number;
        int[] digits = new int[maxDigit];
        int i=0;// index of digits array
        while(number>0){
        int rem =( int)number%10;
if(i==maxDigit){
  // Resize the array if needed
                    maxDigit *= 2;
                    int[] temp = new int[maxDigit];
                    System.arraycopy(digits, 0, temp, 0, digits.length); 
                    digits = temp; 
                }

        digits[i]=rem;
        number/=10;
        i++;
}

    
// sorting the array to get the lasgest and second largest element
int largest=0,second=0;
for(int j=0;j<maxDigit;j++){
if(digits[j]>largest)
largest= digits[j];
}
for(int j=0;j<maxDigit;j++){
if(digits[j]>second && digits[j]<largest)
second= digits[j];
}
// last element of digits array will be largest 

   System.out.print("\nThe largest digit of number : " + dummy + " is " + largest );
   System.out.print("\nThe second largest digit of number : " + dummy + " is " + second );


        scanner.close();
    }
}

