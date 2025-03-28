package org.example;

class Account extends BankAccount {
    public Account(String accountHolderName, int accountNumber, String password) {
        super(accountHolderName, accountNumber, password);
    }

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
        double overdraftLimit = 500.00;

        if (amount > 0 && amount <= balance) {
            // Normal withdrawal
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance +
                    "\n Logged at: " + getTimestamp());
        } else if (amount > balance && amount <= balance + overdraftLimit) {    //add overdraft option

            double overdraftUsed = amount - balance;
            balance -= amount; // Allows negative balance to reflect overdraft
            System.out.println("Overdraft withdrawal of $" + amount + " successful. You now owe: $" + (-balance) +
                    "\n Logged at: " + getTimestamp());
        } else {
            System.out.println("You cannot overdraft more than $500. Please try a smaller amount.");
        }
    }
}