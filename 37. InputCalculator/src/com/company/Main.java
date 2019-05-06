package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int count = 0;

        while (true)
        {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int num = scanner.nextInt();
                sum += num;
                count += 1;
                avg = Math.round ((double)sum / count);
            }
//                System.out.println("SUM = " + sum + " AVG = " + avg);
             else {
                break;
            }
        }
//        scanner.nextLine();

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();

    }
}
