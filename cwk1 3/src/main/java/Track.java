import java.io.File;
import java.io.FileNotFoundException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

/**
 * Represents a point in space and time, recorded by a GPS sensor.
 *
 * @author Thomas Peel
 */

public class Track {
    List<Point> pointList;
    double totalDistance;
    double averageSpeed;

    // TODO: Create a stub for the constructor
    public Track() {
        this.pointList = new ArrayList<>();
    }


    // TODO: Create a stub for readFile()
    public void readFile(String filename) throws FileNotFoundException {
        this.pointList.clear();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        // skipping first line, cause its a header
        while (scanner.hasNextLine()) {
            String lineOfData = scanner.nextLine();
            String[] data = lineOfData.split(",");
            if (data.length != 4) {
                throw new GPSException("invalid data");
            }
            ZonedDateTime time = ZonedDateTime.parse(data[0]);
            double longitude = Double.parseDouble(data[1]);
            double latitude = Double.parseDouble(data[2]);
            double elevation = Double.parseDouble(data[3]);
            Point point = new Point(time, longitude, latitude, elevation);
            this.add(point);
        }
        scanner.close();
    }


    // TODO: Create a stub for add()
    public void add(Point point) {
        this.pointList.add(point);
    }

    // TODO: Create a stub for get()
    public Point get(int index) {
        if (index < 0 || index >= size()) {
            throw new GPSException("invalid index");
        }
        return this.pointList.get(index);
    }

    // TODO: Create a stub for size()
    public int size() {
        return this.pointList.size();
    }

    // TODO: Create a stub for lowestPoint()
    public Point lowestPoint() {
        if (this.pointList.isEmpty()) {
            throw new GPSException("Track is empty");
        }
        Point lowest = this.pointList.get(0);
        for (int i = 1; i < this.pointList.size(); i++) {
            Point current = this.pointList.get(i);
            if (current.getElevation() < lowest.getElevation()) {
                lowest = current;
            }
        }
        return lowest;
    }

    // TODO: Create a stub for highestPoint()
    public Point highestPoint() {
        if (this.pointList.isEmpty()) {
            throw new GPSException("Track is empty");
        }
        Point highest = this.pointList.get(0);
        for (int i = 1; i < this.pointList.size(); i++) {
            Point current = this.pointList.get(i);
            if (current.getElevation() > highest.getElevation()) {
                highest = current;
            }
        }
        return highest;
    }

    // TODO: Create a stub for totalDistance()
    public double totalDistance() {
        if (this.pointList.size() < 2) {
            throw new GPSException("Not enough points for calculation of total distance ");
        }
        this.totalDistance= 0.0;
        for (int i = 1; i < this.pointList.size(); i++) {
            Point previousPoint = this.pointList.get(i - 1);
            Point currentPoint = this.pointList.get(i);
            totalDistance += Point.greatCircleDistance(previousPoint, currentPoint);

        }

        return this.totalDistance;
    }

    // TODO: Create a stub for averageSpeed()
    public double averageSpeed() {
        if (this.pointList.size() < 2) {
            throw new GPSException("Not enough points for calculation of total distance");
        }

        ZonedDateTime startTime = this.pointList.get(0).getTime();
        ZonedDateTime endTime = this.pointList.get(this.pointList.size() - 1).getTime();

        long secondsElapsed = ChronoUnit.SECONDS.between(startTime, endTime);

        return this.averageSpeed = totalDistance() / secondsElapsed;
    }
    public Point getLowestPoint() {
        return this.lowestPoint();
    }

    public Point getHighestPoint() {
        return this.highestPoint();
    }

    public double getTotalDistance() {
        return this.totalDistance();
    }

    public double getAverageSpeed() {
        return this.averageSpeed();
    }
}

