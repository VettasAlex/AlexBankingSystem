package org.example;

public class Main {
    public static void main(String[] args) {

        //Create a normal account & a savings account

        Account account1 = new Account();
        account1.setAccountNumber("12345678");


        SavingsAccount account2 = new SavingsAccount();
        account2.setAccountNumber("87654321");

        System.out.println(account1.getAccountNumber() + " " + account2.getAccountNumber());

        account1.deposit(1000);
        account2.deposit(1900);
        account1.withdraw(1499);
    }
}








