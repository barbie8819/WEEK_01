import java.util.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   System.out.print("\nEnter the valid number : ");
        int  number = scanner.nextInt();
        int dummy = number;
int digitCount=0;
while(dummy>0){
digitCount++;
dummy/=10;
}

        int[] digits = new int[digitCount];

for(int i=digitCount-1;i>=0;i--)
{ 
digits[i]= number%10;
number/=10;
}
   System.out.print("\nArray in order : ");

for(int i=0;i<digitCount;i++)
{ 
   System.out.print(digits[i]+ " ");

}
   System.out.print("\nArray in reverse order : ");


for(int i=digitCount-1;i>=0;i--)
{ 
   System.out.print(digits[i]+ " ");

}


        scanner.close();
    }
}

