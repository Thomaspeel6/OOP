package Excerices;

import java.util.Scanner;

class SpheroidFix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double equatorialRadius, polarRadius;

        System.out.print("Enter the equatorial radius in km: ");
        equatorialRadius = input.nextDouble();

        System.out.print("Enter polar radius in km: ");
        polarRadius = input.nextDouble();
        if (equatorialRadius <= 0 || polarRadius <= 0) {
            System.err.println("Error: Radii must be positive.");
            System.exit(1);
        }

        if (polarRadius > equatorialRadius) {
            System.err.println("Error: Polar radius cannot be greater than equatorial radius.");
            System.exit(1);
        }

        double eccentricity = Math.sqrt(1 - Math.pow(polarRadius, 2) / Math.pow(equatorialRadius, 2));
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(equatorialRadius, 2) * polarRadius;

        System.out.println("Eccentricity: " + eccentricity + "\nVolume: " + volume + " km^3");

        input.close();
    }
}
