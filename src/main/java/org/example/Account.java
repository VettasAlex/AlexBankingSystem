package org.example;

class Account extends BankAccount {

    public double getBalance() {
        return balance;
    }

    //DEPOSIT AND WITHDRAW FUNCTIONS

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Your new balance is: $" + balance + "\n Logged at: " + getTimestamp());
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance + " \n Logged at: " + getTimestamp());
        } else if (amount > balance) {
            overdraft(amount);
        } else {
            System.out.println("Request not valid, please try again!");
        }
    }

    //add overdraft option

    public void overdraft(double amount) {
        double overdraftLimit = 500.00;
        if (amount > balance + overdraftLimit) {
            double ovAmount = amount - overdraftLimit;
            System.out.println("Overdraft withdrawal of $" + amount + " successful. You now owe: $" + ovAmount + "\n Logged at: " + getTimestamp());
        } else {
            System.out.println("You cannot overdraft more than $500. Please try a smaller amount.");
        }
    }
}