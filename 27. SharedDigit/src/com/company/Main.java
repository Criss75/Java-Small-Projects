package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSharedDigit(21, 31));
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)) {
            return false;
        }

        int lastdigit1 = number1 % 10;
        int lastdigit2 = number2 % 10;
        int firsdigit1 = number1 / 10;
        int firstdigit2 = number2 / 10;

        if ((lastdigit1 == lastdigit2) || (lastdigit1 == firstdigit2) || (firsdigit1 == firstdigit2) || (firsdigit1 == lastdigit2) ) {
            return true;}
        else return false;
    }
}
