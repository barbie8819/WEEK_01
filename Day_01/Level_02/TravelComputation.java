import java.util.Scanner;

public class TravelComputation {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the traveler's name
        System.out.print("Enter the name of the traveler: ");
        String name = scanner.nextLine();

        // Input the cities
        System.out.print("Enter the 'from' city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the 'via' city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the 'to' city: ");
        String toCity = scanner.nextLine();

        // Input the distance and time from 'fromCity' to 'viaCity'
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = scanner.nextInt();

        // Input the distance and time from 'viaCity' to 'toCity'
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
        double distanceViaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = scanner.nextInt();

        // Compute the total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("\nThe Total Distance travelled by " + name + " from " +
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " km and " +
                           "the Total Time taken is " + totalTime + " minutes");

        // Close the scanner
        scanner.close();
    }
}
