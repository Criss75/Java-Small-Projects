package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(23006000);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes <0) {
            System.out.println("Invalid value");
        }
        long convertMinutestoYears = minutes/365/24/60;
        long convertMinutesToDays = (minutes % 525600)/24/60;
        System.out.println(minutes + " minute, fac " + convertMinutestoYears + " ani, " + convertMinutesToDays + " zile");

    }

}
