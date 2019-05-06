package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getLargestPrime(220));
    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        for (int i = number / 2; i > 1; i--) {
            if (number % i == 0) {
                number = i;
            }
        }
        return number;
    }
}
