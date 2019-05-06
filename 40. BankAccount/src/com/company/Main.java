package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount myAccount = new BankAccount("RO1212INGB213124124123", 231,
                "Jurescu Cristian", "cj75ro@yahoo.com", "0770634459"  );
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getCustomerEmail());
        System.out.println(myAccount.getCustomerPhoneNumber());
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
        myAccount.withdrawFunds(123);
        myAccount.depositFunds(123124);

    }
}
