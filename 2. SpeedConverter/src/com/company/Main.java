package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printConversion(230);
    }
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion (double kilometerPerHour) {
        long calculateMilesPerHour = toMilesPerHour(kilometerPerHour);
        System.out.println(kilometerPerHour + " km/h = " + calculateMilesPerHour + " mi/h");
    }
}
