public class VolumeOfEarth {
    public static void main(String[] args) {
       // Radius of Earth in kilometers
        double radius = 6378; 

        // Calculate the volume of Earth in kilometers
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        //  calculate the volume in  miles
        double volumeMiles = volumeKm * Math.pow(1.6, 3);

        // Print the results
        System.out.println("The volume of Earth in cubic kilometer is " + volumeKm + " and in cubic miles is " + volumeMiles );
    }
}
