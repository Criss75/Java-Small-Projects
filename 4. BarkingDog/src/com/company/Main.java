package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);


    }
    public static boolean shouldWakeUp (boolean barking, int hourOfTheDay) {
        if (barking && ((hourOfTheDay < 8 && hourOfTheDay >0) || (hourOfTheDay > 22 && hourOfTheDay < 24))) {
            System.out.println("TRUE");
            return true;
        } else {
            System.out.println("FALSE");
            return false;
        }
    }
}
