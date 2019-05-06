package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer Criss = new VipCustomer();
        System.out.println(Criss.getName());

        VipCustomer Erik = new VipCustomer("Jo",23);
        System.out.println(Erik.getEmailAddress());

        VipCustomer Mary = new VipCustomer("Jo", 23, "de@yahoo.com");
        System.out.println(Mary.getCreditLimit());
    }
}
