package Excerices;

import java.util.Scanner;

class Spheroid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double equatorialRadius, polarRadius;

        System.out.print("Enter the equatorial radius in km: ");
        equatorialRadius = input.nextDouble();

        System.out.print("Enter polar radius in km: ");
        polarRadius = input.nextDouble();

        double eccentricity = Math.sqrt(1 - Math.pow(polarRadius, 2) / Math.pow(equatorialRadius, 2));
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(equatorialRadius, 2) * polarRadius;

        System.out.println("Eccentricity: " + eccentricity + "\nVolume: " + volume + " km^3");

        input.close();
    }
}
