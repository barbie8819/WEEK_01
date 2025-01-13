import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            System.out.print("Enter height (in meters): ");
            height[i] = scanner.nextDouble();

            System.out.print("Enter weight (in kilograms): ");
            weight[i] = scanner.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nHeight   Weight   BMI      Status");
        for (int i = 0; i < n; i++) {
            System.out.print(height[i] + "   ");
            System.out.print(weight[i] + "   ");
            System.out.print(bmi[i] + "   ");
            System.out.println(status[i]);
        }

        scanner.close();
    }
}
