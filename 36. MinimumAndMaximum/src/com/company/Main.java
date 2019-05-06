package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int max = -21312312;
        int min = 1231231312;

        while (true) {
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                System.out.println("Invalid number. Exiting...");
                break;
            }
//            scanner.nextLine();
        }
        System.out.println("Min = " + min + ", max = " + max);
        scanner.close();
    }
}
