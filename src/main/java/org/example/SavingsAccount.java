package org.example;

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, int accountNumber, String password) {
        super(accountHolderName, accountNumber, password);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Your new balance is: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance + "\nLogged at: " + getTimestamp());
        } else if (balance - amount < 100) {
            System.out.println("You need to have at least $100 in your savings account. Try a different account or a different amount");
        } else {
            System.out.println("Request not valid, please try again!");
        }
    }
}