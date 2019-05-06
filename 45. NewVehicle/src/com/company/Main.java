package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Skoda skoda = new Skoda(36);
        skoda.steer(45);
        skoda.accelerate(30);
        skoda.accelerate(20);
        skoda.accelerate(-5);
        skoda.changeVelocity(23,33);
    }
}
