package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numbersDividedByThreeAndFive(230,538);
    }

    private static void numbersDividedByThreeAndFive (int number1, int number2) {
        int count = 0;
        int sum = 0;

        for (int i = number1; i <= number2; i++) {
            if (i % 15 == 0) {
                count +=1;
                System.out.println(count + " Number that can be divided with both 3 and 5 is " + i);
                sum += i;
                if (count == 3) {
                    break;
                }
            }
        }
        System.out.println("Sum of these numbers is " + sum);
    }
}
