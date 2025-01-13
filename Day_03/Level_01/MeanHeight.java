import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Create an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0; 
        Scanner scanner = new Scanner(System.in);

        // Get input values from the user
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

System.out.println("The mean height of 11 players : " + mean);
        // Close the scanner
        scanner.close();
    }
}
