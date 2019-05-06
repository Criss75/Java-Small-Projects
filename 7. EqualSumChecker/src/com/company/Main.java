package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(4,5,9));
        System.out.println(hasEqualSum(1,-1,0));

    }

    public static boolean hasEqualSum (int a, int b, int c) {
       return a + b == c;
    }
}
