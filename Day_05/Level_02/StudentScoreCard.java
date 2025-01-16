import java.util.Random;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for students
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Physics (random 60-100)
            scores[i][1] = random.nextInt(41) + 60; // Chemistry (random 60-100)
            scores[i][2] = random.nextInt(41) + 60; // Math (random 60-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 300.0) * 10000) / 100.0; // Rounded to 2 decimal places

            results[i][0] = total;
            results[i][1] = Math.round(average * 100) / 100.0; // Rounded to 2 decimal places
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to calculate grades based on percentage
    public static char[] calculateGrades(double[][] results) {
        int numStudents = results.length;
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 70) {
                grades[i] = 'B';
            } else if (percentage >= 60) {
                grades[i] = 'C';
            } else if (percentage >= 50) {
                grades[i] = 'D';
            } else if (percentage >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10c\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0],
                    results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students

        // Step 1: Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Step 2: Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Step 3: Calculate grades based on percentage
        char[] grades = calculateGrades(results);

        // Step 4: Display the scorecard
        displayScorecard(scores, results, grades);
    }
}