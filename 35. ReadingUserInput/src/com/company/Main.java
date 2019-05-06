package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number " + order);

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int newValue = scanner.nextInt();
                sum += newValue;
                counter += 1;

                if (counter == 11) {
                    break;
                }

            } else {
                System.out.println("Invalid value");
            }
            scanner.nextLine();
        }
        System.out.println("Sum is " + sum);
        scanner.close();
    }


}
