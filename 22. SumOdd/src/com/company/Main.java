package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumOdd(1, 100));
    }

    public static boolean isOdd(int number) {
        return !(number < 1 || number % 2 == 0);
    }

    public static int sumOdd(int start, int end) {

        if ((start > end) || (start < 1) || (end < 1)) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}
