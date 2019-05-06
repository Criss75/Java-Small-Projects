package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter number of integer values:");
        int capacity = scanner.nextInt();
//        getIntegers(capacity);
        printArray(getIntegers(capacity));
        printArray(sortIntegers(getIntegers(capacity)));
    }

    private static int [] getIntegers (int capacity) {

        int [] myArray = new int [capacity];
        System.out.println("Enter " + capacity + " integer numbers:");
        for (int i= 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        } return myArray;
    }

    private static void printArray (int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("number " + (i+1) + " is " + array[i]);
        }
    }

    private static int [] sortIntegers (int [] array) {
        int [] sortedArray = new int[array.length];

        for (int i=0; i< array.length; i++) {
            sortedArray[i] = array [i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray [i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

         return sortedArray;
    }
}

