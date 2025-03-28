package org.example;

class SavingsAccount extends Account {


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Your new balance is: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance + " Logged at: " + getTimestamp());
        } else if (amount > balance) {
            System.out.println("Bitch u broke af, ask less!");
        } else {
            System.out.println("Request not valid, please try again!");
        }
    }
}