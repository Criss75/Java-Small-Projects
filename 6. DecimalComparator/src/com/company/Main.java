package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    private static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        int a = (int) (x * 1000);
        int b = (int) (y * 1000);

        return a == b;
    }
}

