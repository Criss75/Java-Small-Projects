package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(true,35));

    }

    private static boolean isCatPlaying (boolean summer, int temparature) {
        if (summer) {
            return (temparature < 45 && temparature > 25);
        } else return (temparature < 35 && temparature > 25);
        }
    }

