package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canPack(0, 5, 4));
        System.out.println(3%5);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal > (5 * bigCount + smallCount) || bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (5 * bigCount <= goal) {
            return (5 * bigCount + smallCount) >= goal;
        }

        if (5 * bigCount > goal) {
            return goal % 5 <= smallCount;
        } else return true;
    }
}


