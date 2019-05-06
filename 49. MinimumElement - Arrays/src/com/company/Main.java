package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the number of integers to be calculated: ");
        int count = scanner.nextInt();
        scanner.nextLine();
//        readIntegers(count);
        System.out.println("Minimum number is " + findMind(readIntegers(count)));
    }

   private static int [] readIntegers (int count) {
        int [] array = new int [count];

        for (int i=0; i<array.length; i++) {
            System.out.println("Enter number " + (i+1));
            array [i] = scanner.nextInt();
        }

       System.out.println("Your array is: " + Arrays.toString(array));
        return array;
   }

   private static int findMind (int [] array) {
        int minValue = array [0];

        for (int i=1; i<array.length; i++) {

            if (array[i] < minValue) {
                minValue = array [i];
            }

        }

        return minValue;
   }
}
