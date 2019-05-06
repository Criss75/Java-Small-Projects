package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Sum of even numbers is " + getEvenDigitSum(42341345));
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {

            int digit = number % 10 % 2;
            if (digit == 0) {
                sum = sum + number%10;
            }
            number = number / 10;
        } return sum;
    }
}
