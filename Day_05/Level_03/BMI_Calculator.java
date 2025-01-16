import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }

        return result;
    }

    // Method to determine BMI status
    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to display the results in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2] + "\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];

        // Input height and weight for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight (in kg) for person " + (i + 1) + ":");
            data[i][0] = scanner.nextDouble();

            System.out.println("Enter the height (in cm) for person " + (i + 1) + ":");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] results = calculateBMIAndStatus(data);

        // Display results
        displayResults(results);
    }
}