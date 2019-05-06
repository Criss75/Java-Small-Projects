package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Radius is 34. Circle area is " + area (23));
        System.out.println("Rectangle side is x = 34 and y = 56. Rectangle area is " + area(34, 56));
    }

    public static double area (double radius) {
        if (radius <0) {
            return -1;
        } else {
            return Math.PI * radius * radius;
        }
    }

    public static double area (double x, double y) {
        if (x < 0 || y <0) {
            return -1;
        } else {
            return x * y;
        }
    }
}
