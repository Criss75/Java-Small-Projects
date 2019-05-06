package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println(hasTeen(0,0,20));

    }
    private static boolean hasTeen (int a, int b, int c) {
        return ((a<20 && a>12) || (b<20 && b>12) || (c<20 && c>12) );
    }

    private static boolean isTeen (int age) {
        return ((age>12) && (age<20));
    }
}
