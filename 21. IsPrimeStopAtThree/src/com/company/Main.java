package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    printThreePrimes(456, 5453);
    }

    private static boolean isPrime (int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        } return true;
    }

    private static void printThreePrimes (int number1, int number2) {
        int count = 0;
        for (int i = number1; i <= number2; i++) {
            if (isPrime(i)) {
                count += 1;
                System.out.println(count + "prime number is " + i);
                if (count == 3) {
                    break;
                }
            }
        }
    }
}
