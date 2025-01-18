import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        System.out.println("Provide feedback as follows:");
        System.out.println("'H' if my guess is too high, 'L' if it is too low, 'C' if I am correct.");

        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess(lowerBound, upperBound, random);
            System.out.println("Is your number " + guess + "?");
            char feedback = getUserFeedback(scanner);

            switch (feedback) {
                case 'H':
                    upperBound = guess - 1;
                    break;
                case 'L':
                    lowerBound = guess + 1;
                    break;
                case 'C':
                    System.out.println("Yay! I guessed your number: " + guess);
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid feedback. Please respond with 'H', 'L', or 'C'.");
            }

            if (lowerBound > upperBound) {
                System.out.println("Hmm, something went wrong. Are you sure about your feedback?");
                break;
            }
        }

        scanner.close();
    }

    // Generate a random guess between the lower and upper bounds
    private static int generateGuess(int lowerBound, int upperBound, Random random) {
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Get user feedback on the computer's guess
    private static char getUserFeedback(Scanner scanner) {
        System.out.print("Enter your feedback (H/L/C): ");
        return scanner.next().trim().toUpperCase().charAt(0);
    }
}
