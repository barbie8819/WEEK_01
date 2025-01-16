import java.util.Scanner;

public class VotingEligibility {

    // Method to generate a random 2-digit age for n students and return as a 1D array
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Randomly generate age between 10 and 99
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    // Method to check if the age is valid and determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];  // 2D array to store age and can vote status

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Can Vote";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] array) {
        System.out.printf("%-10s%-10s\n", "Age", "Can Vote");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-10s%-10s\n", array[i][0], array[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        // Generate random ages for the given number of students
        int[] ages = generateRandomAges(numStudents);

        // Check voting eligibility
        String[][] votingStatus = checkVotingEligibility(ages);

        // Display the result in tabular format
        displayTable(votingStatus);

        scanner.close();
    }
}
