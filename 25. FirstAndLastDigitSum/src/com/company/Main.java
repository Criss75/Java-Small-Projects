package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            return -1;
        }

        int lasDigit = number % 10;

        while (number >= 10) {
            number = number / 10;
        }
        System.out.println("Number is " + number);
        return number + lasDigit;
    }
}
