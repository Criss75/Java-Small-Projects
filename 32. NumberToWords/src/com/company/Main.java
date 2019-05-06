package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        numberToWords(321300);
    }

    public static void numberToWords(int number) {

        int reversedNumber = reverse(number);
        int numberCount = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        System.out.print("Number is " + number + " = ");

        for (int i = 0; i < numberCount; i++) {
            int num = reversedNumber % 10;
            switch (num) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reversedNumber = reversedNumber / 10;
        }
    }

    private static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    private static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
