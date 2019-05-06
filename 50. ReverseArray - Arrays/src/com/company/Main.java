package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
	// write your code here
        int [] array = {2,4,5,52,2,1,3,34,4};
        System.out.println("Initial array is " + Arrays.toString(array));
        reverse(array);

        }
    public static void reverse (int [] array) {
        int [] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length-1-i];
        }
        System.out.println("Reversed array is " + Arrays.toString(reversedArray));
    }
}
