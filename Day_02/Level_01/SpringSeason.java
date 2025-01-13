public class SpringSeason {
    public static void main(String[] args) {
        // Ensure the program receives exactly two command-line arguments
        if (args.length != 2) {
            System.out.println("Please provide two integer values: month and day.");
            return;
        }

        // Parse command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date falls in the spring season
        boolean isSpringSeason = false;

        if (month == 3 && day >= 20 && day <= 31) { // March 20 to 31
            isSpringSeason = true;
        } else if (month == 4 && day >= 1 && day <= 30) { // April
            isSpringSeason = true;
        } else if (month == 5 && day >= 1 && day <= 31) { // May
            isSpringSeason = true;
        } else if (month == 6 && day >= 1 && day <= 20) { // June 1 to 20
            isSpringSeason = true;
        }

        // Output result
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
