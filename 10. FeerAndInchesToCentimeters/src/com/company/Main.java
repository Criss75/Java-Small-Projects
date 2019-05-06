package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        calcFeetAndInchesToCentimeters(7, calcFeetAndInchesToCentimeters(5));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double toCentimeters = 2.54 * inches + 12 * 2.54 * feet;
        if (toCentimeters > 0 && inches > 0) {
            System.out.println(feet + " feet  and " + inches + " inches = " + toCentimeters + " centimeters");
            return toCentimeters;
        } else {
            System.out.println("Error - use only positive numbers");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        double feetToInches = (double) 1/12 * inches;
        if (inches > 0 ) {
            System.out.println(feetToInches + " feet in " + inches + " inches");
            return feetToInches;
        } else {
            return -1;
        }
    }
}
