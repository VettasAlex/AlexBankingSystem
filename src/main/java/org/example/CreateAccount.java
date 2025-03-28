package org.example;

import java.util.Scanner;

public class CreateAccount {

        public BankAccount createAccount(Scanner scanner) {


            System.out.print("Enter your full name: ");
            String accountHolderName = scanner.nextLine().trim();
            accountHolderName = accountHolderName.replaceAll("\\s+", " "); //removes multiple spaces

            int accountNumber = 10000000 + (int)(Math.random() * 90000000);

            System.out.print("Create a password (min 6 characters): ");
            String password = scanner.nextLine();

            // actually create the account (both normal & savings)
            System.out.println("Would you like a normal account or a savings account? \nPress [1] for normal account\nPress [2] for savings account");
            int accChoice = scanner.nextInt();
            BankAccount newAccount = null;
            String accountType = ""; // create account type to store

            if(accChoice == 1){
                newAccount = new Account(accountHolderName, accountNumber, password);
                accountType = "Normal Account";
                System.out.println("Normal account created successfully!");

            } else if (accChoice == 2){
                newAccount = new SavingsAccount(accountHolderName, accountNumber, password);
                accountType = "Savings Account";
                System.out.println("Savings account created successfully!");

            } else {
                System.out.println("Please provide a valid answer ([1] or [2])");
            }

            if (newAccount != null) {
                Users.saveUserToFile(accountType, accountHolderName, accountNumber, password);
            }
            return newAccount;
        }



}


