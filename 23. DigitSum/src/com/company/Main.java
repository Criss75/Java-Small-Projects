package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Sum of digits for number 3456 is = " + sumDigits(3456));
    }

    public static int sumDigits (int number) {

        if (number < 10) {
            return -1;
        }

        int sum =0;

        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        return sum;
    }
}
