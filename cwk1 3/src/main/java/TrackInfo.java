import java.io.FileNotFoundException;

/**
 * Program to provide information on a GPS track stored in a file.
 *
 * @author Thomasas Peel
*/

public class TrackInfo {


    public static void main(String[] args) throws FileNotFoundException {
    if (args.length == 0) {
      System.out.println("No filename provided. Please provide a filename " +
              "as a command line argument.");
      System.exit(0);
    }


    Track track = new Track();
    try {
        track.readFile(args[0]);
        double averageSpeed = track.getAverageSpeed();
        double totalDistance = track.getTotalDistance();
        System.out.println(track.pointList.size() + " points in track");
        System.out.println("Lowest point is " + track.getLowestPoint());
        System.out.println("Highest point is " + track.getHighestPoint());
        System.out.printf("Total distance = %.3f km\n", totalDistance / 1000);
        System.out.printf("Average speed = %.3f m/s", averageSpeed);
    } catch (GPSException error) {
        System.out.println("Error with data: " + error.getMessage());
        System.exit(1);
    } catch (FileNotFoundException error){
        System.out.println("Error with file: "+ error.getMessage());
        System.exit(1);
    }
  }
}