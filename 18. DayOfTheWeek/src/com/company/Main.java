package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printDayOfTheWeek(1);
        dayOfTheWeek(4);
    }

    public static void printDayOfTheWeek (int day) {
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }

    public static void dayOfTheWeek (int input) {
        if (input == 1) {
            System.out.println("Sunday");
        } else if (input == 2){
            System.out.println("Monday");
        } else if (input == 3){
            System.out.println("Tuesday");
        } else if (input == 4){
            System.out.println("Wednesday");
        } else if (input == 5){
            System.out.println("Thursday");
        } else if (input == 6){
            System.out.println("Friday");
        } else if (input == 7){
            System.out.println("Saturday");
        }
    }

}
