package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSameLastDigit(13,36,56));
    }

    public static boolean hasSameLastDigit (int number1, int number2, int number3) {

        int lastDigitNumber1 = number1 % 10;
        int lastDigitNumber2 = number2 % 10;
        int lastDigitNumber3 = number3 % 10;
        System.out.println(lastDigitNumber1);

        if (!isValid(number1) || !isValid(number2) || !isValid(number3) || (lastDigitNumber1 != lastDigitNumber2)
        && (lastDigitNumber1 != lastDigitNumber3) && (lastDigitNumber2 != lastDigitNumber3)) {
            return false;
        }   return true;

    }

    public static boolean isValid (int number) {
        return (number > 9 && number < 1001);
    }
}
