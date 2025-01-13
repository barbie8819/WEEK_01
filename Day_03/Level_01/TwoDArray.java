import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of rows: ");
        int row = scanner.nextInt();
System.out.print("Enter a number of colums: ");
        int col = scanner.nextInt();
       int[][] array = new int[row][col];
      
        for (int i = 0; i <row; i++) {
        for (int j = 0; j <col; j++) {
        array[i][j]= scanner.nextInt();
          
                }
              
            }
        int[] arrayOne = new int[row*col];
int index=0;
  for (int i = 0; i <row; i++) {
        for (int j = 0; j <col; j++) {
         arrayOne[index]=array[i][j];
          index++;
                }
              
            }
        // Display the array
      for (int i = 0; i <index; i++) {
        System.out.print(arrayOne[i] + " ");

}
        scanner.close();
    }
}
