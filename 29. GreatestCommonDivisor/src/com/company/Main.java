package com.company;

public class Main {

    public static void main(String[] args) {
        getGreatestCommonDivisor(12,30);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int i = first / 2;

        if (first < 10 || second < 10) {
            return -1;
        }

        while (i > 0) {
            if (first % i == 0) {
                if (second % i == 0) {
                    System.out.println("Greatest common divisor is " + i);
                    return i;
                }
            }
            i--;
        }
        return i;
    }
}
