package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(11211));
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int temp = number;
        while (temp != 0) {
            reversedNumber = reversedNumber + temp % 10;
            temp = temp / 10;
            reversedNumber = reversedNumber * 10;
        }
        reversedNumber = reversedNumber/10;
        System.out.println("Reversed numbe is " + reversedNumber);
        System.out.println("Number is " + number);
        return number == reversedNumber;
    }
}
