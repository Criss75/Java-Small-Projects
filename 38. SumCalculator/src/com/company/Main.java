package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code
        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.setFirstNumber(23);
        sumCalculator.setSecondNumber(54);
        System.out.println(sumCalculator.getAdditionResult());
    }
}
